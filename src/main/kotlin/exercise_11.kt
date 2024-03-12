// 11. Crie uma função que receba uma lista de strings e
// retorne uma lista com todas as strings que começam
// com a letra "A", em ordem alfabética.

fun filtrarStringsComecandoComA(lista: List<String>): List<String> {
    return lista.filter { it.startsWith("A", ignoreCase = true) }
        .sorted()
}

fun main() {
    val listaDeStrings = listOf("Maçã", "Banana", "Abacaxi", "Uva", "Ameixa")

    val listaFiltrada = filtrarStringsComecandoComA(listaDeStrings)
    println("Strings que começam com 'A' em ordem alfabética: $listaFiltrada")
}







