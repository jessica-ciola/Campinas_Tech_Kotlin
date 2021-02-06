package basico.controle

import java.util.*

fun main() {

    val leitura = Scanner(System.`in`)
    val valores: MutableList<Double> = mutableListOf()

    var opcao: String = ""

    do{

        //Inserindo a info pelo prompt

        println("Digite o valor desejado: ")
        val compra = readLine()!!.toDouble()

        //add na lista
        valores.add(compra)


        //regra dentro do while
        println("Continuar dentro do while?")
        opcao = readLine() ?: "N"
    }while(opcao != "N" && opcao != "n")

    for (valor in valores) {

        println("Valor do produto: ${valor}")

    }

    for(i in 10 downTo 1){
        println(i)
    }

    for(i in 0..30 step 5){
        println(i)
    }

    for(i in 30 downTo 0 step 5){
        println(i)
    }



}