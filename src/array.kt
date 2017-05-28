package it.ioprogrammo.kotlin.array

fun main(args: Array<String>) {
    val vettore = arrayOf(1, 2, 3, 4)

    println("Dimensioni array: " + vettore.size)

    for (numero in vettore) {
        println("Numero: " + numero)
    }

    val powersOfTwo = Array(20, { i -> Math.pow(2.0, i.toDouble()) })

    for ((index, value) in powersOfTwo.withIndex()) {
        println("Potenza 2^$index: $value")
    }


}