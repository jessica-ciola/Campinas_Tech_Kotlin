package basico.controle

fun main() {

    // Argumentos/parametros nomeados
    println(nivelHierarquico(chefe = "Maria", funcionario = "Jose"))

}

fun nivelHierarquico(funcionario: String, chefe: String): String{
    return "$funcionario é subimisso(a) a $chefe"
}
