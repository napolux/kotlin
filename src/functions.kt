package it.ioprogrammo.kotlin.functions

fun main(args: Array<String>) {
    helloNessuno()
    println(helloUno("Francesco"))
    println(helloTanti("Francesco", "Mario", "Giuseppe", "Roberta", "Monica"))
}

// funzione con 0 parametri e nessun ritorno
fun helloNessuno() {
    println("Ciao nessuno")
}

// Un parametro e un ritorno
fun helloUno(name: String) : String {
    return "Ciao $name"
}

// n parametri, un ritorno
fun helloTanti(vararg names: String) : String {
    return "Hello " + names.joinToString()
}