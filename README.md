# BASI DI KOTLIN 

In questo progetto sono presenti dei file *.kt* (kotlin) contenenti la sintassi del linguaggio di programmazione.
Kotlin nasce nel 2015 ed è sviluppato da google con l'intenzione di sostituire java nello sviluppo di applicazioni android.
**Anch'esso compila su *jvm* e quindi è compatibile con l'interprete di java**
Riporto qui il riassunto della sintassi base di kotlin, per vederne l'utilizzo vedere i file singolarmente


## Variabili
- `val` = costante, `var` = variabile
- Tipi: `Int`, `Double`, `Boolean`, `String`, `Char`, `Any`
- Nullable: `String?`

## Stringhe
- Lunghezza: `str.length`
- Accesso: `str[i]`
- Conversioni: `"123".toInt()`, `123.toString()`

## Liste
- Immutabile: `listOf()`
- Mutabile: `mutableListOf()`
- Accesso: `[i]`
- Loop: `for`, `forEach`
- Funzioni: `filter`, `map`, `sorted`

## Map
- `mapOf()`, `mutableMapOf()`
- Accesso: `map[key]`
- Operazioni: `put`, `remove`
- Check: `in`, `containsKey`

## Controllo flusso
- `if / else`
- `when` (switch)
- Operatori: `&& || !`
- Range: `in 1..10`
- Type check: `is`

## Funzioni
```kotlin
fun f(x: Int = 0): Int { return x }
val lambda: (Int) -> Int = { it * it }
```

# Kotlin OOP

## Classi

```kotlin

// il costruttore è all'interno delle parentesi tonde, è possibile definirlo anche successivamente
open class Studente(val nome: String, var eta: Int) {
    fun info() = println("$nome, $eta anni")
}
```

* `open` → permette l’ereditarietà
* Proprietà nel costruttore
* Metodi dentro la classe

---

## Data Class

```kotlin
data class Indirizzo(val via: String, val citta: String)
```

* Usata per **contenere dati**
* Genera automaticamente:

  * `toString()`
  * `equals()`
  * `hashCode()`
  * `copy()`
* Ideale per oggetti semplici

---

## Interfacce

```kotlin
interface Volante {
    fun vola()
    fun atterra() = println("Atterro")
}
```

* Definisce **comportamenti**
* Metodi astratti o con implementazione
* Niente stato (no variabili normali)

---

## Inheritance (Ereditarietà)

```kotlin
class StudenteSpeciale(nome: String, eta: Int) :
    Studente(nome, eta) {

    override fun info() {
        println("Studente speciale")
    }
}
```

* `:` → estende una classe
* `override` → ridefinisce metodi
* `protected` → visibile nelle sottoclassi

---

## Implementare Interfacce

```kotlin
class Uccello : Volante {
    override fun vola() = println("Sto volando")
}
```

---

## Concetti chiave

* Classe = struttura + comportamento
* Data class = solo dati
* Interfaccia = contratto
* Inheritance = riuso codice
