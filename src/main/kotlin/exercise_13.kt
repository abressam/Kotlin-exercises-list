// 13. Crie uma função de ordem superior chamada operacaoMatematica que
// aceita dois números e uma função lambda. A função operacaoMatematica deve aplicar
// a função lambda aos dois números e retornar o resultado. Em seguida, crie algumas funções
// lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão.
// Use a função de ordem superior para realizar essas operações com diferentes pares de números.
// Função de ordem superior que aceita dois números e uma função lambda
fun operacaoMatematica(a: Double, b: Double, operacao: (Double, Double) -> Double): Double {
    return operacao(a, b)
}

fun main() {
    val soma: (Double, Double) -> Double = { a, b -> a + b }
    val subtracao: (Double, Double) -> Double = { a, b -> a - b }
    val multiplicacao: (Double, Double) -> Double = { a, b -> a * b }
    val divisao: (Double, Double) -> Double = { a, b ->
        if (b != 0.0) {
            a / b
        } else {
            throw ArithmeticException("Erro: Divisão por zero.")
        }
    }

    val resultadoSoma = operacaoMatematica(15.0, 25.0, soma)
    println("Soma: $resultadoSoma")

    val resultadoSubtracao = operacaoMatematica(12.0, 5.5, subtracao)
    println("Subtração: $resultadoSubtracao")

    val resultadoMultiplicacao = operacaoMatematica(8.0, 4.5, multiplicacao)
    println("Multiplicação: $resultadoMultiplicacao")

    val resultadoDivisao = operacaoMatematica(10.0, 2.0, divisao)
    println("Divisão: $resultadoDivisao")
}









