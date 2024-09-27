package com.example.kotlinapplication.patternmatching

import java.util.Scanner

// TODO:
// Zaimplementuj funckję, która będzie zwracać wartość zniżki w zależności od podanej kwoty
// Przedziały:
// - Poniżej 50 brak zniżki
// - Od 50 do 100 - 5%
// - Od 100 do 500 - 10%
// - Powyżej 500 - 15%
private fun getDiscountPercentage(amount: Double): Double = when {
    amount < 50 -> 0.0
    amount in 50.0..<100.0 -> 0.05
    amount in 100.0..<500.0 -> 0.1
    else -> 0.15
}

private fun getDiscountAmount(amount: Double, discountPercentage: Double) : Double {
    return discountPercentage * amount
}

private fun getFinalPrice(amount: Double, discountAmount: Double) : Double {
    return amount - discountAmount
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the total purchase amount: ")
    val amount = scanner.nextDouble()

    val discountPercentage = getDiscountPercentage(amount)

    val discountAmount = getDiscountAmount(amount, discountPercentage)
    val finalPrice = getFinalPrice(amount, discountAmount)

    println("Discount applied: ${discountPercentage * 100}%")
    println("Final price after discount: $finalPrice")
}


