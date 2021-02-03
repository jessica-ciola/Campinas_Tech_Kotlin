package basico.exercicios

fun main() {

    val x : Boolean = false
    val y : Boolean = true
    val w: Boolean = x xor y
    val z: Boolean = w && y


    println("Booleano de W: " + w) //xor retornando true

    println( true xor false) //xor retornando true

    println(w&&y) // Retorna True

    println("Retorna True com &&: " + z) //and retornando true
       


}