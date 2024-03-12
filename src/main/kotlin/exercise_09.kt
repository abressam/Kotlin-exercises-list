// 9. Crie uma função que receba uma lista de números inteiros e
// retorne uma lista com os números em ordem crescente,
// sem usar o método de ordenação da linguagem.

fun OrderList(list: MutableList<Int>): List<Int> {
    val size = list.size

    for (i in 0 until size - 1) {
        for (j in 0 until size - 1 - i) {
            if (list[j] > list[j + 1]) {
                val aux = list[j]
                list[j] = list[j + 1]
                list[j + 1] = aux
            }
        }
    }

    return list
}

fun main() {
    val list = mutableListOf(5, 2, 8, 1, 7, 20, 0, 6)

    val newList = OrderList(list.toMutableList())
    println("Lista ordenada: $newList")
}





