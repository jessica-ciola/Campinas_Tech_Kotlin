package basico.controle

fun main(){
    val nota: Double = 5.0

    if(nota >=7.0){
        println("Passou!!!")
    }else{
        print("Não Pasou!!!")
    }


    //Atribuindo a uma variavel

    val resultado = if(nota >=7.0){
        "Passou!!!"
    }else{
        "Não Pasou!!!"
    }

    println(resultado)

    //Sem chaves

    val resultado2 = if(nota >=7.0) "Passou!!!" else if(nota>= 5 && nota<7) "Recuperação" else  "Não Pasou!!!"


    println(resultado2)


    val sentimento = true

    println("Hoje estou ${if(sentimento) "Alegre" else "Triste"}")


    val nota2:Double = 9.50

    if(nota2 in 9.00..10.00){
        println("Otima nota")
    }

    when(nota2){
        10.00,9.00-> println("Otima nota")
        8.99,7.00-> println("Boa nota")
        6.99, 4.00-> println("Recuperação")
        3.99,0.00-> println("Não Passou")
        else -> println("Nota invalida")
    }


}