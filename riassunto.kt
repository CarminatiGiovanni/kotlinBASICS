package com.example.kotlintutorial
interface Volante {
    fun vola()
    fun atterra() = println("Sto atterrando")
}

fun main(){

    /////////////////////////////////////////////da qui programmiamo ////////////////////////////////////////7

    // 1. -------------------------- variabili NATIVE:

    // in kotlin non è necessario specificare il tipo della variabile es (Int,Double,String) ma è buona pratica

    //Byte = 8 bit; Int = 32 bit; Long = 64 bit
    val costante: Int = 5 // val = costante
    //Float = 32 bit, Double = 64 bit
    var decimale: Double = 1.1 // var = variabile che può cambiare valore
    var booleano: Boolean = true // o false
    var stringa: String = "stringa esempio"
    var carattere: Char = 'C'
    var se_non_sai_cosa_sara: Any = "letteralmente qualsiasi datatype, meglio evitare"

    // in kotlin le variabili possono essere anche nulle! per farlo si aggiunge un punto di domanda:
    var anchenull: String? = null
    var nonnull: String = "non può essere null perchè manca -> ?"

    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- metodi stringhe
    // --------------------------------------------------------------------------------------------------

    val str = "  Hello Kotlin  "

    // 1. Lunghezza e accesso ai caratteri
    println(str.length)         // 15
    println(str[0])             // ' '

    // 8. Conversione e manipolazione rapida
    val numStr = "123"
    val num = numStr.toInt()       // 123
    val str2 = 456.toString()      // "456"
    println(num)
    println(str2)


    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- metodi liste
    // --------------------------------------------------------------------------------------------------
    // in kotlin ci sono liste, array, set, mappe. Ci limitiamo ad analizzare le liste

    // 1. Creazione di liste
    val numbers = listOf(1, 2, 3, 4, 5)           // lista immutabile
    val strings = listOf("Kotlin", "Java", "Python")
    val mixed = listOf(1, "Hello", 3.14, true)

    val mutableNumbers = mutableListOf(10, 20, 30) // lista mutabile

    // 2. Accesso agli elementi
    println(numbers[0])        // 1
    println(strings.get(1))    // "Java"

    // accesso e modifica
    mutableNumbers[1] = 99
    mutableNumbers.add(40)
    mutableNumbers.removeAt(0)

    // 4. Iterazione
    for (n in numbers) { // iterazione più semplice
        println(n)
    }
    numbers.forEach { //inserisce all'interno della variabile it il valore ed esegue il codice tra parentesi
        println(it)
    }

    for ((index, value) in numbers.withIndex()) { // iterazione con indice
        println("numbers[$index] = $value")
    }

    // 6. Filtraggio e trasformazione
    val filtered = numbers.filter { it > 2 }   // [3,4,5]
    val mapped = numbers.map { it * 2 }        // [2,4,6,8,10] map applica a ogni elemento quanto tra parentesi (può essere una funzione)

    // ordinamento
    val sorted = numbers.sorted()

    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- map
    // --------------------------------------------------------------------------------------------------
    // Sono l'equivalente dei dizionari di python

    val map = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)  // immutabile
    val mutableMap = mutableMapOf("x" to 10, "y" to 20)           // mutabile

    // 2. Accesso ai valori
    println(map["Alice"])          // 25
    // 3. Modifica (solo mutableMap)
    mutableMap["z"] = 30           // aggiunge chiave/valore
    mutableMap["x"] = 15           // modifica valore
    mutableMap.remove("y")         // rimuove chiave

    // 4. iterazione
    for ((key, value) in map) {
        println("$key -> $value")
    }

    map.forEach { (key, value) -> println("$key -> $value") }

    // 5. ricerca
    println("Alice" in map)        // true
    println("Eve" in map)          // false
    println(map.containsKey("Bob")) // true
    println(map.containsValue(30))  // true

    // 6, Chiavi valori
    val keys = map.keys
    val values = map.values

    // 7. conversioni
    val listOfPairs = map.toList()          // [(Alice,25), (Bob,30), (Charlie,35)]

    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- if else
    // --------------------------------------------------------------------------------------------------

    // 0. OPERATORI LOGICI:

    // and -> &&
    // or -> ||
    // not -> !

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

    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- funzioni
    // --------------------------------------------------------------------------------------------------

    // nelle funzioni è possibile settare i tipi, valori di default e return type
    fun greetFull(name: String, age: Int = 18): String{
        return "Ciao $name, hai $age anni"
    }

    val s1 = greetFull("Bob")       // Ciao Bob, hai 18 anni
    val s2 = greetFull("Bob", 25)   // Ciao Bob, hai 25 anni

    // lambda function
    val square: (Int) -> Int = { x -> x * x }

    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- classi
    // --------------------------------------------------------------------------------------------------

    // INTERFACCIA
//    interface Volante {
//        fun vola()
//        fun atterra() = println("Sto atterrando")
//    }

    // DATA CLASS per dati secondari
    data class Indirizzo(val via: String, val citta: String)

    // CLASSE COMPLETA
    open class Studente(val nome: String, var eta: Int, val scuola: String) : Volante {

        var voto: Int = 0           // con controllo
            set(value) { if(value in 0..10) field = value }

        private var segreto = "Nessuno sa"

        // secondario
        constructor(nome: String, eta: Int, scuola: String, voto: Int) : this(nome, eta, scuola) {
            this.voto = voto
        }

        fun info() = println("$nome, $eta anni, scuola $scuola, voto $voto")
        protected fun mostraSegreto() = println(segreto)

        override fun vola() = println("$nome sta volando!")
        override fun atterra() = println("$nome è atterrato")

        fun cambioIndirizzo(nuovo: Indirizzo) = println("$nome si è trasferito in ${nuovo.via}, ${nuovo.citta}")
    }

    // USO
    val S1 = Studente("Alice", 16, "Liceo", 9)
    S1.info()
    S1.vola()
    S1.atterra()
    S1.cambioIndirizzo(Indirizzo("Via Roma 10", "Milano"))
    S1.voto = 15                 // ignorato
    println(S1.voto)

    // SOTTOLASSE
    class StudenteSpeciale(nome: String, eta: Int, scuola: String, voto: Int) :
        Studente(nome, eta, scuola, voto) {
        fun salutaSpeciale() {
            println("Ciao, sono speciale!")
            mostraSegreto() // protected accessibile
        }
    }

    val v2 = StudenteSpeciale("Bob", 17, "Liceo Scientifico", 8)
    v2.info()
    v2.salutaSpeciale()
    v2.vola()

}