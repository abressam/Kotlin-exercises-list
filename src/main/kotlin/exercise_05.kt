// 5. Implemente uma função lambda que retorne o maior valor entre dois números.

val HigherValue: (Int, Int) -> Int = { a, b -> if (a > b) a else b }

fun main() {
    val number1 = 15
    val number2 = 8

    val resultado = HigherValue(number1, number2)
    println("O maior valor entre $number1 e $number2 é: $resultado")
}


