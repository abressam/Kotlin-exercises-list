//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica
// se a string é um palíndromo. A função deve ignorar espaços em branco e ser case-insensitive
// (não distinguir maiúsculas de minúsculas). Em seguida, use essa função para verificar se
// algumas palavras são palíndromos.
fun isPalindrome(str: String): Boolean {
    val newString = str.lowercase().replace("\\s".toRegex(), "")
    val length = newString.length

    for (i in 0 until length / 2) {
        if (newString[i] != newString[length - 1 - i]) {
            return false
        }
    }

    return true
}

fun main() {
    val value1 = "radar"
    val value2 = "Mundo"
    val value3 = "Arara"

    println("$value1 é um palíndromo? ${isPalindrome(value1)}")
    println("$value2 é um palíndromo? ${isPalindrome(value2)}")
    println("$value3 é um palíndromo? ${isPalindrome(value3)}")
}









