package basico.aula24exercicios

fun numConta():Int{
    println("Digite o número da conta")
    var numeroConta = readLine()!!.toInt()
    return numeroConta

}

fun valorRetirada():Double{
    println("Digite o o valor que você deseja fazer uma retirada")
    var retirada = readLine()!!.toDouble()
    return retirada
}

fun valorDepositado():Double{
    println("Digite o o valor que você deseja fazer um deposito")
    var deposito = readLine()!!.toDouble()
    return deposito
}

fun main(){

    var opcao: String = ""
    var saldo: Double = 0.00
    var banco: Int = 0

    do{

        //Inserindo a info pelo prompt
        println("---------------------------------------")
        println("----------------MENU-------------------")
        println("Digite 1 - Para entrar com o número da conta")
        println("Digite 2 - Para vizualizar o saldo da conta")
        println("Digite 3 - Para para fazer uma retirada")
        println("Digite 4 - Para para fazer um depósito")
        println("Digite 5 - Para para sair")
        println("---------------------------------------")

        val menu = readLine()!!.toInt()

        if(menu == 1){
            var banco:Int = numConta()

        } else if(menu == 2){
            println("Seu saldo na conta $banco é de R$ $saldo")

        }else if(menu == 3){
            var retirada = valorRetirada()
            println("O valor da retirada na conta $banco foi de R$ $retirada")

            saldo -= retirada

        } else if(menu == 4){
            var deposito = valorDepositado()
            println("O valor do depósito na conta $banco foi de R$ $deposito")

            saldo += deposito

        } else if(menu == 5){
            break
        } else { println("Opção inválida")}




        //regra dentro do while
        println("Continuar dentro do while?")
        opcao = readLine() ?: "N"


    }while(opcao != "N" && opcao != "n")

}

