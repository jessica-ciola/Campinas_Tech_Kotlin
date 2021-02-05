package basico.operadores

fun main(){
    var a: Int? = null //null safety operator

    println(a?.dec()) //precisa do valor null safety pra executar

    var b: Int? = 4 //null safety operator

    println(b?.dec())

    //Não travar caso caia um avlor nulo no processo

    //Proteção pra variavel pra deixar um valor padrao,  operador Elvis ?:

    val opcional: String? = null
    val obrigatorio: String = opcional?: "Valor Padrão"

    println(obrigatorio)
}