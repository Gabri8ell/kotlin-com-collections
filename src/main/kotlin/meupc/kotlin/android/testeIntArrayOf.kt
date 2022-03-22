package meupc.kotlin.android

fun main(){
    val values = intArrayOf(1, 83, 45, 5, 23, 78)

    values.sort()
    values.forEach {
        println(it)
    }
}