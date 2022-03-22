package meupc.kotlin.android

fun main() {
    val salarios = doubleArrayOf(2500.00, 8900.00, 3850.00, 1500.00)
    salarios.sort()
    salarios.forEach { println(it) }

    println("Media dos salários ${salarios.average()}")
    println("Mario salário ${salarios.maxOrNull()}")
    println("Menor salário ${salarios.minOrNull()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500 }

    println(salariosMaiorque2500)

    println(salarios.count { it in 2500.00..10000.00 })
    //imprime valores entre 2500 e 10000

    println(salarios.find { it == 2500.00 })

    println(salarios.any { it == 1500.00 })
}