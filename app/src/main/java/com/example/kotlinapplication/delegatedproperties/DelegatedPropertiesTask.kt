package com.example.kotlinapplication.delegatedproperties

import kotlin.properties.Delegates


class UserProfile(private val userProfileMap: MutableMap<String, Any?>) {

    // TODO: Zaimplementuj fullName w taki sposób, żeby zwracał stringa złączonego z firstName i lastName
    // firstName i lastName odczytaj z mapy userProfileMap
    // Zaimplementuj to w taki sposób, żeby wartość tworzyła się dopiero przy próbie odczytania
    // Wykorzystaj do tego jednego ze standardowych delegatów
    val fullName : String by lazy {
        "${userProfileMap["firstName"]} ${userProfileMap["lastName"]}"
    }
    // TODO: Zaimplementuj email w taki sposób, żeby za każdym razem, kiedy przypisywana jest nowa wartość,
    //  na konsoli wypisywała się wiadomość "Email changed from oldValue to newValue" odpowiednio uzupełniona
    // Wykorzystaj do tego jednego ze standardowych delegatów
    var email: String by Delegates.observable("nothing") {
        prob, old, new ->
        println("Email change $old to $new")
    }

    // TODO: Wykorzystaj jednego ze standardowych delegatów, żeby odczytać w krótki sposób wartości dla age i location
    val age: Int by userProfileMap
    val location: String by userProfileMap
}

fun main() {
    val userMap = mutableMapOf<String, Any?>(
        "firstName" to "John",
        "lastName" to "Doe",
        "age" to 30,
        "location" to "New York"
    )

    val userProfile = UserProfile(userMap)

    println("Full Name: ${userProfile.fullName}")

    userProfile.email = "john.doe@example.com"
    userProfile.email = "john.newemail@example.com"

    println("Age: ${userProfile.age}")
    println("Location: ${userProfile.location}")
}
