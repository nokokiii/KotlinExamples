package com.example.kotlinapplication.patternmatching

// TODO:
// Napisz funkcję, która za pomocą wyrażenia when będzie sprawdzać zawartość podanej listy i zwracać opisujący ją string
// Warianty do sprawdzenia:
// - pusta lista
// - wszystkie wartości w liście są dodatnie
// - wszystkie wartości w liście są ujemne
// - lista zawiera liczbę 0
// - lista zawiera zarówno waartości dodatnie jak i ujemne
private fun analyzeList(numbers: List<Int>) : String = when {
    numbers.isEmpty() -> "Lista jest pusta"
    numbers.all { it > 0 } -> "Wszystkie wartiości są dodatnie"
    numbers.all { it < 0 } -> "Wszystkie wartiości są ujemne"
    0 in numbers -> "0 zawiera się w liście"
    else -> "Lista zawiera wartości ujemne i dodatnie"
}

fun main() {
    val numbers = listOf(-3, -5, 0, 4, 7)
    val numbers2 = listOf(1, 2, 3, 4)

    println(analyzeList(numbers))
    println(analyzeList(numbers2))
    println(analyzeList(listOf()))
}



