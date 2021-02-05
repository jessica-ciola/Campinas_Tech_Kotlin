package basico.aula21exercicios

import java.util.*

fun compraFinalizada(compras:MutableList<Any>){

    println("Nome do produto: " + compras[0] +
            " Quantidade: "+ compras[1] +
            " Valor unitário: " + compras[2] +
            " Valor total da compra: " + multiplicaCompra(compras[1].toString(), compras[2].toString())
    )
}

fun multiplicaCompra(x:String, y:String):Any = x.toDouble() * y.toDouble()

fun main(){

    val compras: MutableList<Any> = mutableListOf()
    val leitura = Scanner(System.`in`)

    println("Digite o nome do produto")
    val produto: String = leitura.nextLine()
    compras.add(produto)
    println("Digite o valor do produto")
    val valor: Double = leitura.nextDouble()
    compras.add(valor)
    println("Digite a quantidade do produto")
    val quantidade: Int = leitura.nextInt()
    compras.add(quantidade)

    compraFinalizada(compras)

}