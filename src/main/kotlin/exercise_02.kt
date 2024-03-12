// 2. Crie uma função que receba um array de inteiros e retorne o maior número.
fun getMaxValue(value: Array<Int>): Int {
    val max: Int = value.maxOrNull() ?: 0

    return max
}

fun main() {
    try {
        val input: Array<Int> = arrayOf(1, 4, 2, 9, 23, 12)
        val result = getMaxValue(input)
        println(result)
    } catch (e: NumberFormatException) {
        println("O input não é válido.")
    }
}