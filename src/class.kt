package it.ioprogrammo.kotlin.classes

import java.util.*
import java.time.ZoneId
import java.time.LocalDate



fun main(args: Array<String>) {
    val mioLibro = Libro("Il mio bel libro", "Edizioni Master", 2017)
    val tuoLibro = Libro("Il tuo libro è un brutto libro", "Edizioni Master", 2016)
    val libroConGenere = Libro("Titolo", "Edizioni Master", 2018, "Giallo")

    println(mioLibro.libroDiQuestAnno())
}

class Libro constructor(titolo: String, casaEditrice: String, var anno: Int) {

    constructor(titolo: String, casaEditrice: String, anno: Int, genere: String) : this(titolo, casaEditrice, anno) {

    }

    init {
        println("Classe inizializzata con questi dati: Titolo -> $titolo, casaEditrice -> $casaEditrice, anno -> $anno")

    }

    fun libroDiQuestAnno(): Boolean {
        val data = Date()
        val localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()

        return anno == localDate.year
    }


}