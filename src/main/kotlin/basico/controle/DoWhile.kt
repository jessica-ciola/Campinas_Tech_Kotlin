package basico.controle

import java.util.*

fun main(){

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

    println(valores)

}