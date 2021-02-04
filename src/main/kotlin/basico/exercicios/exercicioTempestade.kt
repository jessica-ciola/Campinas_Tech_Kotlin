package basico.exercicios

fun main() {

    var chuva: Boolean = true
    var molha: Boolean = true
    var vento: Boolean = true
    var tempestade: Boolean

    tempestade = chuva xor molha xor vento
    println(tempestade)

    tempestade = chuva || molha || vento
    println(tempestade)

    tempestade = chuva && molha && vento
    println(tempestade)


}