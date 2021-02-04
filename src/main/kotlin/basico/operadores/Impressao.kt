package basico.operadores

import java.util.*

fun main(){
    val leitura = Scanner(System.`in`) //leitura do prompt

    println("Digite o valor de a: ")
    val a: Int = leitura.nextInt() //pega a variavel digitada pelo usuario

    println("Digite o valor de b: ")
    val b: Int = leitura.nextInt()

    val c: Int = a + b

    println("O valor de c é : " + c)
}