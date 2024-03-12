// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade".
// Em seguida, crie uma lista de objetos "Pessoa" e
// ordene a lista em ordem alfabética pelo atributo "nome".

data class Pessoa(val nome: String, val idade: Int)

fun main() {
    val pessoa1 = Pessoa("Amanda", 23)
    val pessoa2 = Pessoa("Carol", 27)
    val pessoa3 = Pessoa("Jorge", 22)
    val pessoa4 = Pessoa("Aline", 17)
    val pessoa5 = Pessoa("Romeo", 30)

    val listaPessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5)

    val listaOrdenada = listaPessoas.sortedBy { it.nome }

    listaOrdenada.forEach {
        println("Nome: ${it.nome}, Idade: ${it.idade}")
    }
}
