// 1. Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário.
fun checkValue(value: Int): Boolean {
    return value % 2 == 0
}

fun main() {
    try {
        val input = "2"
        val value = input.toInt()

        val result = checkValue(value)
        println(result)
    } catch (e: NumberFormatException) {
        println("O input não é um número inteiro válido.")
    }
}