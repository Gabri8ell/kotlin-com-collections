package meupc.kotlin.android

fun main() {
    val pair: Pair<String, Double> = Pair ("Gabriel", 9500.00)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: ${k}, Valor: ${v}") }
    println("-------------------------------------------")
    val map2 = mapOf(
        "Mariana" to 2500,
        "Barbara" to 3500)

    map2.forEach {(k, v) -> println("Chave: ${k} Valor: ${v}") }
}