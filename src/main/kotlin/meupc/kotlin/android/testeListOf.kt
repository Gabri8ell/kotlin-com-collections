package meupc.kotlin.android

fun main(){
    val gabriel = Funcionario("Gabriel", 2500.00, "CLT")
    val barbara = Funcionario("Barbara", 2500.00, "PJ")
    val mariana = Funcionario("Mariana", 2500.00,"CLT")

    val funcionarios = listOf(gabriel, barbara, mariana)

    funcionarios.forEach { println(it) }
    println("------------------------------------------")
    println(funcionarios.find { it == gabriel })
    println("------------------------------------------")
    funcionarios.sortedBy { it.nome }.forEach { println(it) }//ordena pelo nome e imprime pelo forEach
    println("------------------------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }//agrupa pelo tipo de contratação
    println("------------------------------------------")
}

