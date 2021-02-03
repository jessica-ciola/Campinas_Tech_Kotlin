package basico.operadores



fun main(){
    val a : String = "Jessica"
    val b : String = "Jessica"
    println(a == b) //
    println(a === b) //Se são tipos iguais, posição
    println("Jessica" === "Jessica")
    // isso aqui  não pode >>> println("Jessica" == "Jessica")

    println(3 != 2)
    println(3 < 2)
    println(3 > 2)
    println(3 >= 2)

    //visualG (e) e (ou)

    val x : Boolean = true
    val y : Boolean = true

    val z : Boolean = x || y // || é o ou
    val w: Boolean = x && y // && é o e

    val d: Boolean = x xor y

    println("Booleano de Z: " + z)
    println("Booleano de W: " + w)
    println("Booleano de d: " + d)

}