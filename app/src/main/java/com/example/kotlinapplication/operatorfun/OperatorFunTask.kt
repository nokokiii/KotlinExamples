package com.example.kotlinapplication.operatorfun

// TODO:
// 1. Napisz klasę Multiplier, która będzie wykorzystywać operator fun

class Multiplier {
    operator fun invoke(a : Int, b : Int) : Int { return a * b }
}

fun main() {
// TODO: Odkomentuj
    val multiplier = Multiplier()
    val result = multiplier(4, 5)
    println("The product of 4 and 5 is: $result")
}
