package basico.aula21exercicios

import java.util.*

fun soma(a:Int,b:Int){
    val c: Int = a + b

    println("$a + $b = $c")

}

fun sub(a:Int,b:Int){
    val c: Int = a - b

    println("$a - $b = $c")

}

fun mult(a:Int,b:Int){
    val c: Int = a * b

    println("$a * $b = $c")

}

fun modulo(a:Int,b:Int){
    val c: Int = a % b

    println("$a % $b = $c")

}


fun main(){

    val leitura = Scanner(System.`in`) //leitura do prompt

    println("Digite o valor 1: ")
    val n1: Int = leitura.nextInt() //pega a variavel digitada pelo usuario

    println("Digite o valor 2: ")
    val n2: Int = leitura.nextInt()

    soma(n1,n2)
    sub(n1,n2)
    mult(n1,n2)
    modulo(n1,n2)

}

