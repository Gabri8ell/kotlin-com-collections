package meupc.kotlin.android

fun main(){
    val salarios = DoubleArray(3)

    salarios[0] = 1500.00
    salarios[1] = 2000.00
    salarios[2] = 3500.00


    salarios.sort()
    salarios.forEach { println(it) }

    println("///////////////////////")
    salarios.forEachIndexed { index, salario ->
        salarios[index] *= 1.1
    }

    salarios.forEach { println(it) }

    println("///////////////////////")
    val salarios2 = doubleArrayOf(4700.00, 4000.00, 5300.00)
    salarios2.sort()
    salarios2.forEach { println(it) }


    println("///////////////////////")
}