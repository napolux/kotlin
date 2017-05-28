package it.ioprogrammo.kotlin

fun main(args: Array<String>) {

    var a = 5
    var b = 10

    // Uso tradizionale
    var max = a
    if (a < b) max = b

    // if/else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // Come espressione
    max = if (a > b) a else b

    println(max)

}