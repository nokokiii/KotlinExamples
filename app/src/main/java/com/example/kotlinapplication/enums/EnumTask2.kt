package com.example.kotlinapplication.enums

// TODO:
// Stwórz enum klasę OrderStatus, która będzie przyjmować jako parametr Boolean mówiący o tym, czy dany status jest końcowyym statusem
// Są możliwe 4 statusy: Pending, Shipped, Delivered i Cancelled
// Delivered i Cancelled są statusami końcowymi, a Pending i Shipped nie
enum class OrderStatus(val status : Boolean) {
    Pending(false),
    Shipped(false),
    Delivered(true),
    Cancelled(true)
}

// TODO:
// Znajdż instancję enum klasy za pomocą jej nazwy
// Zbuduj stringa opisującego jej parametr, nazwę i kolejność
// Jeśli wariant enum klasy o podanej nazwie nie istnieje, zwróć stringa opisującego błąd
fun getStatusByName(statusName: String): String {
    for (status in OrderStatus.entries) {
        if (status.name == statusName) {
            return "Name: ${status.name}, Status: ${status.status}. Pending -> Shipped -> Delivered"
        }
    }
    return ""
}

// TODO: wypisz wszystkie warianty enum klasy
fun printOrderStatuses() {
    OrderStatus.entries.forEach { println(it.name) }
}

fun main() {
    println(getStatusByName("Pending"))
    println(getStatusByName("Delivered"))
    println(getStatusByName("InvalidStatus"))

    println("\nAll order statuses:")
    printOrderStatuses()
}

