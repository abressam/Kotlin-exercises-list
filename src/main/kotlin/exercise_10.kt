// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura".
// Adicione um método chamado "area" que calcula e retorna a área do triângulo.

import kotlin.math.pow

class Triangulo(val base: Double, val altura: Double) {
    fun area(): Double {
        return 0.5 * base * altura
    }
}

fun main() {
    val triangulo = Triangulo(base = 15.0, altura = 30.0)

    val areaDoTriangulo = triangulo.area()
    println("A área do triângulo é: $areaDoTriangulo")
}






