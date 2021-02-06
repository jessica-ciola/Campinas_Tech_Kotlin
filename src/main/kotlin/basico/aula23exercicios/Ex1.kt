package basico.aula23exercicios

fun main(){

    val numeros: MutableList<String> = mutableListOf()

    for(i in 1..5){
        println("Digite o valor $i por extenso: ")
        val numero = readLine()
        numeros.add(numero.toString())

    }

    for((indice,numero) in numeros.withIndex()){
        println("${indice+1} - $numero")
    }

}

/*fun recebeLista(numeros: MutableList<String>):MutableList<String>{

}/*