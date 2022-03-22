package meupc.kotlin.android

fun main(){
    val nomes = Array(4){""}

    nomes[0] = "Gabriel"
    nomes[1] = "Marcia"
    nomes[2] = "Barbara"
    nomes[3] = "Mariana"

    for(nome in nomes){
        println(nome)
    }
    println("//////////////////////")

    nomes.sort()

    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Gabriel, Barbara, Mariana, Marcia")

    println("//////////////////////")
    nomes2.sort()

    nomes.forEach { println(it) }
}