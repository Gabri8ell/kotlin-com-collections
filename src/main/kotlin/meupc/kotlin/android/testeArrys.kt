package meupc.kotlin.android

fun main() {
    val values = IntArray(5)

    values[0] = 12
    values[1] = 7
    values[2] = 6
    values[3] = 9
    values[4] = 4

    for (valor in values){
        println(valor)
    }

    println("\\\\\\\\\\\\\\?///////////////")
    values.sort()
    values.forEach {
        println(it)
    } //lambda = values.forEach { println(it) }
    println("\\\\\\\\\\\\\\?///////////////")

    for(index in values){
        println(values[index])
    }
    println("\\\\\\\\\\\\\\?///////////////")


}