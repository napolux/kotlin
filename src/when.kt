package it.ioprogrammo.kotlin.whenesempio

import java.lang.Integer.parseInt

fun main(args: Array<String>) {

    val x = 2
    val s = 2.0

    val validNumbers = Array(5, { i -> (i * i).toDouble() })


    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x è diverso da 1 e da 2")
        }
    }

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("altro")
    }
}