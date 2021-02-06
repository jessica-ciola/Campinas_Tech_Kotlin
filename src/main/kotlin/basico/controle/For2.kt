package basico.controle

fun main(){

    val alunos = listOf("Jes", "Raf","Beto")

    for ((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }

  for(i in 1..10) {
      if (i == 5){
          break
      }
      println(i)
  }

    for(i in 1..10) {
        if (i == 5){
            println("Entrou no if com continue")
            continue
        }
        println(i)
    }

}