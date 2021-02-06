package basico.controle

import java.util.*

fun main(){

    val leitura = Scanner(System.`in`)
    val valores: MutableList<Double> = mutableListOf()

    var opcao: String = ""

    while(opcao != "N" && opcao != "n"){

        //Inserindo a info pelo prompt

        println("Digite o valor desejado: ")
        val compra = readLine()!!.toDouble()

        //add na lista
        valores.add(compra)


        //regra dentro do while
        println("Continuar dentro do while?")
        opcao = readLine() ?: "N"
    }

    println(valores)

}