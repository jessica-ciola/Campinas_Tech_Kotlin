package basico.operadores

fun main(){
    var a: Int = 5
    var b: Int = 3
    var c: Int = 20

    //visual cont <- cont +1
    b+=a // b=b+a
    println(b)

    b-=4 // b = b-4
    println(b)

    b*=a
    println(b)

    b/=a
    println(b)

    //visual MOD 5 MOD 3 (resto)
    c %= 6  // b = b mod b
    println(c)
}