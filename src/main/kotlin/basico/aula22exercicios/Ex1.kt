package basico.aula22exercicios

import java.util.*

fun calculo(a:Int){

    if(a>=0) println("$a é positivo") else println("$a é negativo")

}

fun main(){
    val leitura = Scanner(System.`in`)

    println("Digite um número: ")
    val num: Int = leitura.nextInt()

    calculo(num)
}