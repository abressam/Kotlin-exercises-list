// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um
// palíndromo (ou seja, pode ser lida da mesma forma de trás para frente).

fun Palindrome(str: String): Boolean {
    val length = str.length

    for (i in 0 until length / 2) {
        if (str[i] != str[length - 1 - i]) {
            return false
        }
    }

    return true
}

fun main() {
    val value1 = "radar"
    val value2 = "mundo"
    val value3 = "arara"

    println("$value1 é um palíndromo? ${Palindrome(value1)}")
    println("$value2 é um palíndromo? ${Palindrome(value2)}")
    println("$value3 é um palíndromo? ${Palindrome(value3)}")
}

