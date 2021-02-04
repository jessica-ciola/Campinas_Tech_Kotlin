package basico.aula21exercicios

fun exp(a:Int, b:Int){
    val resultado: Int = ((a+b) *a)/b

    println("A soma/mult/div de $a e $b é : $resultado")

}

fun main() {
    exp(a = 2, b=3)

}