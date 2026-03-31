package com.example.kotlintutorial

fun main() {
    // 1. Creazione di Map
    val map = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)  // immutabile
    val mutableMap = mutableMapOf("x" to 10, "y" to 20)           // mutabile

    // 2. Accesso ai valori
    println(map["Alice"])          // 25
    println(map.get("Bob"))        // 30
    println(map.getOrDefault("Eve", 0)) // 0 se chiave non esiste

    // 3. Modifica (solo mutableMap)
    mutableMap["z"] = 30           // aggiunge chiave/valore
    mutableMap["x"] = 15           // modifica valore
    mutableMap.remove("y")         // rimuove chiave
    println(mutableMap)            // {x=15, z=30}

    // 4. Iterazione
    for ((key, value) in map) {
        println("$key -> $value")
    }

    map.forEach { (key, value) -> println("$key -> $value") }

    // 5. Controllo presenza
    println("Alice" in map)        // true
    println("Eve" in map)          // false
    println(map.containsKey("Bob")) // true
    println(map.containsValue(30))  // true

    // 6. Chiavi e valori separati
    val keys = map.keys
    val values = map.values
    println(keys)   // [Alice, Bob, Charlie]
    println(values) // [25, 30, 35]

    // 7. Trasformazioni
    val newMap = map.mapValues { it.value * 2 }   // moltiplica tutti i valori per 2
    println(newMap)  // {Alice=50, Bob=60, Charlie=70}

    val filteredMap = map.filterKeys { it.startsWith("B") } // solo chiavi che iniziano con B
    println(filteredMap) // {Bob=30}

    // 8. Conversioni
    val listOfPairs = map.toList()          // [(Alice,25), (Bob,30), (Charlie,35)]
    val arrayOfPairs = map.toList().toTypedArray()
    println(listOfPairs)
    println(arrayOfPairs.joinToString())
}