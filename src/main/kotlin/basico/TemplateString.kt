package basico

fun main(){

    val nome = "Jessica"
    val aprovados = listOf("Jessica", "Carla", "Fabi")

    var a: Int = 356.dec()
    var b: String = a.toString()

    println("Ola $nome, usando Template String")
    println("Ola ${nome}, usando Template String") //FUnciona entre { tbm

    println("O primeiro colocado é: ${aprovados[0]}")
    println("Int:$a")
    println("Primeiro caracter da String é : ${b.first()}")
    println("Ultimo caracter da String é : ${b.last()}")

}
