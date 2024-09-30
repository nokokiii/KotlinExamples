package com.example.kotlinapplication.functionalinterface

// TODO:
// Zdefiniuj functional interface dla operacji arytmetycznych
// Funkcja powinna przyjmować dwie liczby jako parametry i zwracać wynik
fun interface Operation {
    fun accept(a : Int, b : Int) : Int?
}


// TODO:
// Zaimplementuj funkcję pomocniczą, która wywołuje funkcję z interfasu
fun performOperation(a: Int, b: Int, operation: Operation): Int? {
    return operation.accept(a, b)
}

fun main() {
    // TODO: Odkomentuj
    val addition: Operation = Operation { a, b -> a + b }
    val multiplication: Operation = Operation { a, b -> a * b }
    val subtraction: Operation = Operation { a, b -> a - b }
    val division = Operation { a, b ->  if (a != 0) a / b else null }

    println("Addition: ${performOperation(5, 3, addition)}")
    println("Multiplication: ${performOperation(5, 3, multiplication)}")
    println("Subtraction: ${performOperation(5, 3, subtraction)}")

    println("Division: ${performOperation(10, 2, division)}")
}

// TODO*
// Przerób przykład w taki sposób, żeby wykorzystać operator fun
