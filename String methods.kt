package com.example.kotlintutorial


fun main(){
    // --------------------------------------------------------------------------------------------------
    // 2. ------------------------------- metodi stringhe
    // --------------------------------------------------------------------------------------------------

    val str = "  Hello Kotlin  "

    // 1. Lunghezza e accesso ai caratteri
    println(str.length)         // 15
    println(str[0])             // ' '
    println(str.first())        // ' '
    println(str.last())         // ' '

    // 2. Controllo contenuto
    println(str.contains("Kotlin"))   // true
    println(str.startsWith("  He"))   // true
    println(str.endsWith("in  "))     // true
    println(str.isEmpty())            // false
    println("".isEmpty())             // true

    // 3. Modifica stringhe
    println(str.lowercase())          // "  hello kotlin  "
    println(str.uppercase())          // "  HELLO KOTLIN  "
    println(str.trim())               // "Hello Kotlin"

    // 4. Sostituzione e rimozione
    println(str.replace("Kotlin", "World"))   // "  Hello World  "
    println(str.removePrefix("  Hello "))     // "Kotlin  "
    println(str.removeSuffix(" Kotlin  "))    // "  Hello"

    // 5. Divisione e unione
    val csv = "a,b,c"
    val parts = csv.split(",")                // ["a", "b", "c"]
    val joined = parts.joinToString("-")      // "a-b-c"
    println(parts)
    println(joined)

    // 6. Estrazione sottostringhe
    println(str.substring(2, 7))   // "Hello"
    println(str.subSequence(2, 7)) // "Hello"

    // 7. Ricerca di caratteri o parole
    println(str.indexOf('o'))      // 5
    println(str.indexOf("Kotlin")) // 8
    println(str.lastIndexOf('l'))  // 10

    // 8. Conversione e manipolazione rapida
    val numStr = "123"
    val num = numStr.toInt()       // 123
    val str2 = 456.toString()      // "456"
    println(num)
    println(str2)

    // 9. Iterazione sui caratteri
    for (c in str.trim()) {
        println(c)
    }

    // Esempio combinato
    val result = str.trim().uppercase().replace("KOTLIN", "WORLD")
    println(result) // "HELLO WORLD"
}