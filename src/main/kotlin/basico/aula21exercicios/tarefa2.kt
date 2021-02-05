package basico.aula21exercicios

import java.util.*

fun notas(relacao: MutableList<Any>) {

    val n1:Int = relacao[1] as Int
    val n2:Int = relacao[2] as Int
    val n3:Int = relacao[3] as Int
    val n4:Int = relacao[4] as Int

    val resultado: Int = (n1+n2+n3+n4)/4

    println("A média do aluno(a) ${relacao[0]} , foi: $resultado")

}




fun main(){
    val leitura = Scanner(System.`in`) //leitura do prompt

    val dados: MutableList<Any> = mutableListOf()

    println("Digite o Nome do Aluno: ")
    val aluno: String = leitura.nextLine() //pega a variavel digitada pelo usuario
    dados.add(aluno)

    println("Digite a nota 1: ")
    val nota1: Int = leitura.nextInt()
    dados.add(nota1)

    println("Digite a nota 2: ")
    val nota2: Int = leitura.nextInt()
    dados.add(nota2)

    println("Digite a nota 3: ")
    val nota3: Int = leitura.nextInt()
    dados.add(nota3)

    println("Digite a nota 4: ")
    val nota4: Int = leitura.nextInt()
    dados.add(nota4)


    notas(dados)
}



