package com.example.kotlintutorial

fun main() {
    // 1. Funzione semplice senza ritorno
    fun greet(name: String) {
        println("Ciao, $name!")
    }
    greet("Alice")  // Ciao, Alice!

    // 2. Funzione con ritorno
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    val result = sum(5, 7)
    println(result) // 12

    // 3. Funzione a espressione singola (più compatta)
    fun multiply(a: Int, b: Int) = a * b
    println(multiply(3, 4)) // 12

    // 4. Parametri con valori di default
    fun greetFull(name: String, age: Int = 18) {
        println("Ciao $name, hai $age anni")
    }
    greetFull("Bob")       // Ciao Bob, hai 18 anni
    greetFull("Bob", 25)   // Ciao Bob, hai 25 anni

    // 5. Parametri nominati
    greetFull(age = 30, name = "Charlie")  // Ciao Charlie, hai 30 anni

    // 6. Funzione che ritorna Boolean
    fun isEven(n: Int): Boolean = n % 2 == 0
    println(isEven(4)) // true
    println(isEven(7)) // false

    // 7. Funzioni Lambda (funzioni anonime)
    val square: (Int) -> Int = { x -> x * x }
    println(square(5)) // 25

    val add: (Int, Int) -> Int = { a, b -> a + b }
    println(add(2, 3)) // 5

    // 8. Funzioni di ordine superiore (accettano funzioni come parametri)
    fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
        return op(a, b)
    }
    val sumResult = operate(5, 10) { x, y -> x + y }
    val mulResult = operate(5, 10) { x, y -> x * y }
    println(sumResult) // 15
    println(mulResult) // 50

    // 9. Funzioni inline brevi
    fun greetInline(name: String) = println("Ciao $name")
    greetInline("Diana") // Ciao Diana
}