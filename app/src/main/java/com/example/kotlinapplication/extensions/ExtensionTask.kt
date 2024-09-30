package com.example.kotlinapplication.extensions

//TODO:
// 1. Napisz extension function dla listy intów, która policzy ich średnią

fun List<Int>.average() : Double {
    return this.sum() / this.size.toDouble()
}

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)
    val averageValue = numbers.average()

    println("The average is $averageValue")
}