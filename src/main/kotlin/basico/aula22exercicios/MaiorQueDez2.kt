package basico.aula22exercicios

import java.util.*

fun calculo2(a:Int?){

    if(a == null) println("Valor nulo") else if(a > 10) println("$a é maior que 10!!!") else println("$a é menor que 10")

}

fun main(){
    val leitura = Scanner(System.`in`)

    println("Digite um número: ")
    val num: Int? = leitura.nextInt()

    //val num: Int? = null


    calculo2(num)


}