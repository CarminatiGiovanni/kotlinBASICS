package com.example.kotlintutorial

fun ClassiInterfacceDataclass() {
    // =========================
    // CLASSE BASE
    // =========================
    class Persona(val nome: String, var eta: Int) {
        fun saluta() = println("Ciao, mi chiamo $nome e ho $eta anni")
    }

    val p = Persona("Alice", 20)
    p.saluta()

    // =========================
    // COSTRUTTORE SECONDARIO
    // =========================
    class Persona2(val nome: String) {
        var eta: Int = 0
        constructor(nome: String, eta: Int): this(nome) { this.eta = eta }
        fun saluta() = println("Ciao $nome, $eta anni")
    }

    val p2 = Persona2("Bob", 25)
    p2.saluta()

    // =========================
    // GETTER/SETTER PERSONALIZZATI
    // =========================
    class Persona3(val nome: String) {
        var eta: Int = 0
            set(value) { if(value>=0) field=value }
    }

    val p3 = Persona3("Charlie")
    p3.eta = -5
    p3.eta = 30
    println(p3.eta) // 30

    // =========================
    // EREDITA' E OVERRIDE
    // =========================
    open class Animale {
        open fun verso() = println("Verso generico")
    }

    class Cane: Animale() {
        override fun verso() = println("Bau bau!")
    }

    val c = Cane()
    c.verso()

    // =========================
    // INTERFACCIA
    // =========================
    // da definire fuori dalla funzione, così da errore
    // serve per essere ereditata
    //interface Volante {
    //    fun vola()
    //    fun atterra() = println("Sto atterrando")
    //}

    class Uccello: Volante {
        override fun vola() = println("Sto volando come uccello!")
    }

    val u = Uccello()
    u.vola()
    u.atterra()

    // =========================
    // EREDITA' MULTIPLA (classe + interfaccia)
    // =========================
    open class Studente(open val nome: String, open var eta: Int)

    class StudenteVolante(override val nome: String, override var eta: Int): Studente(nome, eta), Volante {
        override fun vola() = println("$nome sta volando come uno studente volante!")
    }

    val sv = StudenteVolante("Diana", 17)
    sv.vola()

    // =========================
    // VISIBILITA'
    // =========================
    open class TestVisibilita {
        public var pub = 1
        private var priv = 2
        protected var prot = 3 // privata ma visibile anche nelle classi figlie (usata solo se serve)
        internal var intr = 4 // all'interno dello stesso modulo (non capita a noi)
    }

    val tv = TestVisibilita()
    println(tv.pub)   // 1
    // println(tv.priv)  // ERRORE
    // println(tv.prot)  // ERRORE
    println(tv.intr)  // 4

    // =========================
    // DATA CLASS
    // =========================
    data class Punto(val x: Int, val y: Int) // serve solo per contenere dati

    val p1 = Punto(10, 20)
    val P2 = Punto(10, 20)
    println(p1)           // Punto(x=10, y=20)
    println(p1 == P2)     // true (equals confronta i valori)
    val P3 = p1.copy(y = 50)
    println(P3)           // Punto(x=10, y=50)
}