package basico.exercicios

fun main() {
    val (v1, v2, v3, v4, v5) = listOf(2, 3, 5, 8, 10)
    val (v6, v7,v8, v9) = listOf(20, 25, 30, 50)
    val exp1  = (v1* v4+ v6 - v1) - ((v8-v7)+v6)
    val exp2 = (v2*(v2*v2*v2))/(v9 - (v5/v1*v4))
    val exp3 = (((v1*v4)/v2)+(v2*v4)/(v3%v2))


    println("O valor da expressão 1 é: " + exp1)
    println("O valor da expressão 2 é: " + exp2)
    println("O valor da expressão 3 é: " + exp3)
}