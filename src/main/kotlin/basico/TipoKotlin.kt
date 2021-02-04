package basico

fun main(){
    //    dois tipos de variaveis (var e val)
    /*    var: no encapsulamento é getter e setter, é mutável
        val: é só a parte do get, imutável
   */

    val a: Int = 1

    //    inferência de tipo
    val b = 3
    val c = "Oi"

    //    para retornar

    println(c.get(1))

    println(a + b)

    //    tipos em Kotlin
    val num3: Byte = 127 // maxvalue
    val num4: Short = 32767 // maxvalue
    val num1: Int = 2147483647 // tamanho de bites que o algoritmo inteiro comporta
    val num2: Long = 9223372036854775807 // max value
    //    em Kotlin pode se separar os numeros assim 2_147_483_647
    val num5: Double = 3.143423423423423423423423423423423423423444444444444444444333333333333333333322222222222222222444444444444444444444444444444444222222222222333333333333333333333333333333333333333333333333333333
    val num6: Float = 3.14f // muito parecido com double, mas maior, e tem que ter o f no final
    val num7: Char = 'A' // suporta so um caractere
    val num8: Boolean = true // por default e sempre false
    val num9: String = "" // como char mas suporta mais caracteres

    var num10: Any //Recebe qualquer tipo

    num10 = true //recebe um tipo boolenao
    num10 = 10 //depois troca para um int

    /* O Any pode te salvar quando vc não sabe o tipo de
    objeto q está recebendo
    deve ser usado com cautela
    */

    println(2 is Int) // para fazer validacao de tipo em Kotlin is
    println(num1.dec()) // decrementar






}