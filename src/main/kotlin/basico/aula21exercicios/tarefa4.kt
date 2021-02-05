package basico.aula21exercicios

import java.util.*

fun main(){
    val leitura = Scanner(System.`in`) //leitura do prompt

    val produtos: MutableList<String> = mutableListOf()
    val quantidade: MutableList<Int> = mutableListOf()
    val valor: MutableList<Double> = mutableListOf()
    val quaValor: MutableList<Double> = mutableListOf()

    //produto 1
    println("Digite o nome do produto: ")
    val produto1:String = leitura.nextLine()
    produtos.add(produto1)

    println("Digite a quantidade a ser comprada: ")
    val quantidade1:Int = leitura.nextInt()
    quantidade.add(quantidade1)

    println("Digite o valor do produto: ")
    val valor1:Double = leitura.nextDouble()
    valor.add(valor1)

    quaValor.add(quantidade1.toDouble() * valor1)

    //produto 2

    println("Digite o nome do produto: ")
    val produto2:String = leitura.nextLine()
    produtos.add(produto2)

    println("Digite a quantidade a ser comprada: ")
    val quantidade2:Int = leitura.nextInt()
    quantidade.add(quantidade2)

    println("Digite o valor do produto: ")
    val valor2:Double = leitura.nextDouble()
    valor.add(valor2)

    quaValor.add(quantidade2.toDouble() * valor2)

    //produto 3
    println("Digite o nome do produto: ")
    val produto3:String = leitura.nextLine()
    produtos.add(produto3)

    println("Digite a quantidade a ser comprada: ")
    val quantidade3:Int = leitura.nextInt()
    quantidade.add(quantidade3)

    println("Digite o valor do produto: ")
    val valor3:Double = leitura.nextDouble()
    valor.add(valor3)

    quaValor.add(quantidade3.toDouble() * valor3)

    //mostrando

    println("${produtos[0]}  valor total ${quaValor[0]}")
    println("${produtos[1]}  valor total ${quaValor[1]}")
    println("${produtos[2]}  valor total ${quaValor[2]}")



}

