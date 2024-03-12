//15. Vamos criar um programa que utilize funções de alta ordem para operar
// em um array de números inteiros. Você deve criar funções de alta ordem para
// realizar as seguintes operações: filtrarPares: Uma função que filtra e retorna
// apenas os números pares do array; dobrarValores: Uma função que dobra o valor
// de cada número no array; somarValores: Uma função que calcula a soma de todos
// os valores no array. Em seguida, crie um array de números inteiros e utilize as
// funções de alta ordem para realizar essas operações.

fun filtrarPares(array: IntArray): IntArray {
    return array.filter { it % 2 == 0 }.toIntArray()
}

fun dobrarValores(array: IntArray): IntArray {
    return array.map { it * 2 }.toIntArray()
}

fun somarValores(array: IntArray): Int {
    return array.sum()
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = filtrarPares(numeros)
    println("Números pares: ${pares.joinToString()}")

    val dobrados = dobrarValores(numeros)
    println("Números dobrados: ${dobrados.joinToString()}")

    val soma = somarValores(numeros)
    println("Soma dos valores: $soma")
}










