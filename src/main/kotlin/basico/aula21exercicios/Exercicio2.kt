package basico.aula21exercicios

import java.util.*

fun tamanhoPalavra(a: String): Int {
    return a.length
}



fun main() {

    val leitura = Scanner(System.`in`)

    println("Digite uma palavra: ")
    val a: String = leitura.nextLine()

    val tamanho: Int = tamanhoPalavra(a)

    println("A palavra $a tem $tamanho letras")
}