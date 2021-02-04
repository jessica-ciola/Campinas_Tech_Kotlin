package basico.aula21exercicios

fun exp1(a:Int, b:Int=3){

    println("$a * $b = " + (a*b))

}

fun exp2(a:Int=3){
    println("$a * $a = " + (a*a))

}

fun main(){
    exp1(a = 2)
    exp1(a = 2, b = 6)

    exp2()
    exp2(a = 5)

}