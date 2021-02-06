package basico.aula24exercicios


fun main(){
    var opcao: String = ""

    do{

        println("Digite a quantidade de maçãs você deseja comprar: ")
        val macas = readLine()!!.toInt()


        if(macas<12) println("O valor unitário é de R$4,30 e o valo tota da compra é R$ ${macas.toDouble()*4.30}") else
            println("O valor unitário é de R$4,00 e o valo tota da compra é R$ ${macas.toDouble()*4.00}")


        //regra dentro do while
        println("Continuar dentro do while?")
        opcao = readLine() ?: "N"
    }while(opcao != "N" && opcao != "n")
}
