package br.com.alura

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )
    println(pedidos)

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido ->
//        Pair(pedido.numero, pedido)
        pedido.numero to pedido
    }
//    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido ->
//        pedido.numero
//    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis[Pedido(numero = 1, valor = 20.0)])
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes: List<String> = listOf("Alex", "Fran", "Gui", "Paulo", "Gisele", "Mario", "Ana", "Maria")
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome: String -> nome.first() }
    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)