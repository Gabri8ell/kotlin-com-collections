package meupc.kotlin.android

fun main() {
    val gabriel = Funcionario("Gabriel", 2500.00, "CLT")
    val barbara = Funcionario("Barbara", 6500.00, "PJ")
    val mariana = Funcionario("Mariana", 1500.00,"CLT")
    val edilene = Funcionario("Edilene", 3500.00,"PJ")
    val juliana = Funcionario("Juliana", 8500.00,"PJ")

    val funcionariosListOf = mutableListOf(gabriel, mariana)
    funcionariosListOf.forEach { println(it) }
    println("----------------------------------")
    funcionariosListOf.add(barbara)
    funcionariosListOf.forEach { println(it) }
    println("----------------------------------")

    funcionariosListOf.remove(mariana)
    funcionariosListOf.forEach { println(it) }
    println("----------------------------------")

    println("------------SET---------------")
    val funcionariosSet = mutableSetOf(juliana)
    funcionariosSet.forEach { println(it) }
    println("----------------------------------")

    funcionariosSet.add(gabriel)
    funcionariosSet.add(edilene)
    funcionariosSet.forEach { println(it) }
    println("----------------------------------")

    funcionariosSet.remove(juliana)
    funcionariosSet.forEach { println(it) }



}