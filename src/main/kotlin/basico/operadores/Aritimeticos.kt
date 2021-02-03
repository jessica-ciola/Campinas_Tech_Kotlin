package basico.operadores

fun main() {
    val (v1, v2, v3, v4) = listOf(3, 5, 2, 15)
    val soma  = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v4 / v1


    println("A soma é: " + soma)
    println("A subtração de v4 e v2 é: " + subtracao)
    println("A divisão de v4 e v2 é: " + divisao)


}