package basico.aula22exercicios

import java.util.*

fun calculo1(a:Int){

    if(a>10) println("$a é maior que 10!!!")  else println("$a é menor que 10")

}

fun main(){
    val leitura = Scanner(System.`in`)

    println("Digite um número: ")
    val num: Int? = leitura.nextInt()
    val obrigatorio: Int = num?: 0
    if(obrigatorio == 0) println("Valor nulo")
    val num2: Int = num?.toInt()!!


    calculo1(num2)
}