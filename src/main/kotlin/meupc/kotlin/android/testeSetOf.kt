package meupc.kotlin.android

fun main() {
    val gabriel = Funcionario("Gabriel", 2500.00, "CLT")
    val barbara = Funcionario("Barbara", 6500.00, "PJ")
    val mariana = Funcionario("Mariana", 1500.00,"CLT")
    val edilene = Funcionario("Edilene", 3500.00,"PJ")
    val juliana = Funcionario("Juliana", 8500.00,"PJ")

    val funcionarios1 = setOf(gabriel, mariana, juliana)
    val funcionarios2 = setOf(barbara, edilene, juliana)

    val funUnion = funcionarios1.union(funcionarios2)//União dos conjuntos
    println("${funUnion}\n")
    val funInterct = funcionarios1.intersect(funcionarios2)//intersecção - a igualadade entre os conjuntos
    println("${funInterct}\n")
    val funSubtract = funcionarios1.subtract(funcionarios2)//Diferença entre os conjuntos
    println("${funSubtract}\n")

}