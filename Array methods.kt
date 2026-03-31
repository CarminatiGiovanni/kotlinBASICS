package com.example.kotlintutorial
fun main() {
    // 1. Creazione di liste
    val numbers = listOf(1, 2, 3, 4, 5)           // lista immutabile
    val strings = listOf("Kotlin", "Java", "Python")
    val mixed = listOf(1, "Hello", 3.14, true)

    val mutableNumbers = mutableListOf(10, 20, 30) // lista mutabile

    // 2. Accesso agli elementi
    println(numbers[0])        // 1
    println(strings.get(1))    // "Java"
    println(numbers.first())   // 1
    println(numbers.last())    // 5

    // 3. Modifica elementi (solo per liste mutabili)
    mutableNumbers[1] = 99
    mutableNumbers.add(40)
    mutableNumbers.removeAt(0)
    println(mutableNumbers)    // [99, 30, 40]

    // 4. Iterazione
    for (n in numbers) println(n)
    numbers.forEach { println(it) }
    for ((index, value) in numbers.withIndex()) {
        println("numbers[$index] = $value")
    }

    // 5. Aggiunta e rimozione (crea nuove liste immutabili)
    val newList = numbers + 6         // [1,2,3,4,5,6]
    val removedList = newList - 3     // [1,2,4,5,6]
    println(newList)
    println(removedList)

    // 6. Filtraggio e trasformazione
    val filtered = numbers.filter { it > 2 }   // [3,4,5]
    val mapped = numbers.map { it * 2 }        // [2,4,6,8,10]
    println(filtered)
    println(mapped)

    // 7. Ricerca e controllo
    println(numbers.contains(3))    // true
    println(numbers.indexOf(4))     // 3
    println(numbers.lastIndexOf(2)) // 1
    println(numbers.any { it > 4 }) // true
    println(numbers.all { it < 10 }) // true

    // 8. Ordinamento
    val sorted = numbers.sorted()         // [1,2,3,4,5]
    val reversed = numbers.reversed()     // [5,4,3,2,1]
    println(sorted)
    println(reversed)

    // 9. Conversioni
    val arrayFromList = numbers.toTypedArray()
    val listFromArray = arrayFromList.toList()
    println(arrayFromList.joinToString()) // 1,2,3,4,5
    println(listFromArray)                // [1,2,3,4,5]

    // 10. Liste multidimensionali
    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    println(matrix[1][2]) // 6

    for (row in matrix) {
        for (elem in row) print("$elem ")
        println()
    }
}