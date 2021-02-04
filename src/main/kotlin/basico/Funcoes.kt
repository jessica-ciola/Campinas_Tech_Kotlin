package basico

//classe agregacao metodo - java



//funcao sem retorno

fun soma(a: Int, b:Int) {
    println("A soma de A e B \" é \": " + (a+b))

}

fun soma2(a: Int, b:Int = 1) {
    println("A soma de A e B \" é \": " + (a+b))

}

//funcao com retorno

fun multiplicaDoisNumeros(a: Double, b: Double): Double{
    return a * b
}

fun multiplicaDoisNumeros2(a: Double, b: Double) = a * b

//funcao sem retorno

fun multiplicaDoisNumeros3(a: Double, b: Double):Unit = println("O valor é: " + (a*b))

fun mostraLista(compras: MutableList<String>):Any{
    return "a"
}

fun main() {


    soma(a = 1, b=3)
    soma2(a =3)

    val x: Int = 50
    val y: Int = 5

    soma(x,y)

    soma2(y)

    val c: Double = 5.0
    val d: Double = 3.0

    println("A multiplicação de A e B é: " + multiplicaDoisNumeros(c,d))
    println("A multiplicação de A e B é: " + multiplicaDoisNumeros2(c,d))
    multiplicaDoisNumeros3(c,d)

    val compras = listOf("Arroz", "Feijão", "Carne")
    println(compras[0])

    val comprasMutavel: MutableList<String> = mutableListOf("Arroz", "Feijão", "Carne")
    comprasMutavel[0] = "Batata"
    comprasMutavel.add("Peixe")

    println(comprasMutavel[3])

    println(comprasMutavel)

    println(mostraLista(comprasMutavel))

     //lista<String> genericos <Any> pode ter varios formatos dentro
    //pode criar lista vazia
}