package com.example.kotlinapplication.typechecks

import kotlin.math.roundToInt
import kotlin.reflect.typeOf

fun typeCheck(element : Any) : Any  = when(element) {
    is Int -> element * 2
    is String -> element.uppercase()
    is Double -> element.roundToInt()
    else -> element
}


fun main() {
    val mixedList: List<Any> = listOf(1, "hello", false, 3.14, 2, "world", 7.5, true)

    val resultList = mutableListOf<Any>()

    // TODO:
    // 1. Sprawdź typ elementu w liście.
    // Jeśli jest to Int, pomnóż go przez 2
    // Jeśli jest to String, zmień jego litery na wielkie
    // Jeśli jest to Double, zaokrąglij jego wartość do Inta
    // Jeśli jest to Boolean, nie rób nic
    mixedList.forEach { resultList.add(typeCheck(it)) }

    println("Original List: $mixedList")
    println("Resulting List after operations: $resultList")
}
