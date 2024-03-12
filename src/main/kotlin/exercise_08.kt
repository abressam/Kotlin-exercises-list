// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario".
// Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário.
data class Funcionario(val nome: String, val idade: Int, val salario: Double)

fun obterMaiorSalario(lista: List<Funcionario>): Funcionario? {
    if (lista.isEmpty()) {
        return null
    }

    return lista.maxByOrNull { it.salario }
}


fun main() {
    val funcionario1 = Funcionario("Amanda", 23, 10000.0)
    val funcionario2 = Funcionario("Carol", 27, 15000.0)
    val funcionario3 = Funcionario("Jorge", 22, 5000.0)

    val listaFuncionarios = listOf(funcionario1, funcionario2, funcionario3)

    val maiorSalario = obterMaiorSalario(listaFuncionarios)

    if (maiorSalario != null) {
        println("Funcionário com maior salário: ${maiorSalario.nome}")
    } else {
        println("A lista de funcionários está vazia.")
    }
}




