package meupc.kotlin.android

fun main(){
    val gabriel = Funcionario("Gabriel", 2500.00, "CLT")
    val barbara = Funcionario("Barbara", 6500.00, "PJ")
    val mariana = Funcionario("Mariana", 1500.00,"CLT")
    val edilene = Funcionario("Edilene", 3500.00,"PJ")
    val juliana = Funcionario("Juliana", 8500.00,"PJ")

    val funcionario = Repositore<Funcionario>()

    funcionario.create(gabriel.nome, gabriel)
    funcionario.create(mariana.nome, mariana)
    println(funcionario.findAll().forEach { println(it) })
    println("-------------------------------------")
    funcionario.create(barbara.nome, barbara)
    funcionario.remove(mariana.nome)
    println(funcionario.findAll().forEach { println(it) })
}