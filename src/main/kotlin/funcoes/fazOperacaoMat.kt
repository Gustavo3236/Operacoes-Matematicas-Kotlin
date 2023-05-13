package gustavo.operacoes.src.funcoes

import java.util.Scanner

fun fazOperacaoMat() {

    println("Operações Matemáticas")

    val leitor = Scanner(System.`in`)

    println("Digite um número:")
    val numero: Double = leitor.nextDouble()
    println(numero)

    println(
        """
                Qual a operação que deseja fazer?
        
                        Operadores válidos:
        adição(+), subtração(-), divisão(/), multiplicação(*)
    """.trimMargin()
    )
    val operacao: String = readln()
    if (operacao != "+" && operacao != "-" && operacao != "/" && operacao != "*") {
        println("Erro: Você só pode inserir operadores válidos.")
        return
    }
    println(operacao)

    println("Digite o próximo número da operação:")
    val proximoNumero: Double = leitor.nextDouble()

    var resultado = 0.0

    when (operacao) {
        "+" -> {
            resultado = numero + proximoNumero
        }

        "-" -> {
            resultado = numero - proximoNumero
        }

        "/" -> {
            resultado = numero / proximoNumero
        }

        "*" -> {
            resultado = numero * proximoNumero
        }
    }

    println("Resultado da operação: $resultado")

}
