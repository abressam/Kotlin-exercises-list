// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista.

fun getLongerString(lista: List<String>): String? {
    if (lista.isEmpty()) {
        return null
    }

    return lista.maxByOrNull { it.length }
}

fun main() {
    val listStrings = listOf("maçã", "banana", "laranja", "morango", "uva")

    val longerString = getLongerString(listStrings)
    if (longerString != null) {
        println("A string mais longa é: $longerString")
    } else {
        println("A lista está vazia.")
    }
}




