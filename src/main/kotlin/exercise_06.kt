// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite".
// Adicione um método chamado "saque" que recebe um valor como parâmetro
// e subtrai do saldo da conta. Se o valor do saque for maior que o saldo
// da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente".

class SaldoInsuficienteException(message: String) : Exception(message)

class ContaBancaria(var saldo: Double, val limite: Double) {
    fun saque(valor: Double) {
        val saldoDisponivel = saldo + limite

        if (valor > saldoDisponivel) {
            throw SaldoInsuficienteException("Saldo insuficiente")
        }
        saldo -= valor

        if (saldo < 0) {
            throw SaldoInsuficienteException("Saldo insuficiente")
        }
    }
}

fun main() {
    val conta = ContaBancaria(saldo = 1000.0, limite = 500.0)

    try {
        conta.saque(1200.0)
        println("Saque realizado. Novo saldo: ${conta.saldo}")
    } catch (e: SaldoInsuficienteException) {
        println("Erro: ${e.message}")
    }
}



