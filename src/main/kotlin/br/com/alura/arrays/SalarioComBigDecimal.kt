package arrays

import java.math.BigDecimal
import java.math.RoundingMode as RoundingMode1

fun main() {
    // Cadastro de salários
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println("Salários atuais: ${salarios.contentToString()}")

    // Aumento de 10% dos salários, com mínimo e aumento de R$500,00
    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    // Gasto total inicial de todos os salários considerando o aumento de 10%
    val gastoInicial: BigDecimal = salariosComAumento.somatoria()
    println("Gasto Inicial (1 mês): $gastoInicial")

    // Gasto total de todos os salários considerando o aumento de 10% mais o mês atual e os próximos 6 meses
    val meses: BigDecimal = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode1.UP)
    }
    println("Gasto Total (7 meses): $gastoTotal")

    // Busca dos três maiores salários
    val media: BigDecimal = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Média dos três últimos salários: $media")

    // Busca dos três maiores salários
    val mediaMenoresSalarios: BigDecimal = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Média dos três primeiros salários: $mediaMenoresSalarios")
}
