package it.ioprogrammo.kotlin

fun main(args: Array<String>) {
    val mario:String = "Mario"
    var user:String

    user  = "Francesco"

    println("Hello, " + mario)
    println("Hello, " + user)


    val oneMillion = 1_000_000 // 1 milione
    val creditCardNumber = 1234_5678_9012_3456L // carta di credito
    val hexBytes = 0xFF_EC_DE_5E // hex
    val bytes = 0b11010010_01101001_10010100_10010010 // byte

    println("Un milione: " + oneMillion)

    val saluto:String = """
    Ciao mario
    """

    println(saluto)
    println("$user ha guadagnato € $oneMillion")

    var nullable: String? = "abc"
    nullable = null
    nullable = "Mario"

    var notNullable: String = "abc"
    notNullable = null // Errore!
    
}