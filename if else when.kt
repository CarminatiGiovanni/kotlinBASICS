package com.example.kotlintutorial

fun main() {
    // 1. IF / ELSE IF / ELSE
    val x = 10
    if (x > 0) {
        println("Positivo")
    } else if (x < 0) {
        println("Negativo")
    } else {
        println("Zero")
    }

    // IF come espressione (ritorna un valore)
    val parity = if (x % 2 == 0) "Pari" else "Dispari"
    println(parity) // Pari

    // 2. WHEN (equivalente a switch/case)
    val day = 3
    when (day) {
        1 -> println("Lunedì")
        2 -> println("Martedì")
        3 -> println("Mercoledì")
        in 4..5 -> println("Giovedì o Venerdì")
        else -> println("Weekend")
    }

    // WHEN con condizioni
    val score = 85
    when {
        score >= 90 -> println("Ottimo")
        score >= 70 -> println("Buono")
        score >= 50 -> println("Sufficiente")
        else -> println("Insufficiente")
    }

    // WHEN come espressione
    val grade = when (score) {
        in 90..100 -> "A"
        in 70..89 -> "B"
        in 50..69 -> "C"
        else -> "D"
    }
    println(grade) // B

    // 3. Operator logici
    val age = 20
    val hasID = true

    if (age >= 18 && hasID) {
        println("Puoi entrare")
    } else if (age >= 18 && !hasID) {
        println("Hai l'età ma serve documento")
    } else {
        println("Non puoi entrare")
    }

    // Altri operatori utili
    if (x in 1..10) println("Dentro il range")  // in
    if (x !in 11..20) println("Fuori dal range") // !in

    val obj: Any = "Kotlin"
    if (obj is String) println("È una stringa")  // is
}