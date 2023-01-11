package br.com.alura.collections

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0,
        7 to 60.0,
        8 to 200.0
    )

    // Exibido valor nulo independentemente se ele existir ou não
    println(pedidos.get(4))

    // Exibido valor nulo que foi cadastrado para a chave 4
    println(pedidos.getValue(4))

    // Print valor nulo de uma chave inexistente
    println(pedidos.get(5))

    // Exceção, pois valor não existe
    // println(pedidos.getValue(5))

    // Retorna o valor da chave, caso contrário será retornado uma condição especificada
    println(pedidos.getOrElse(1) { "Pedido inexistente" })

    // Retorna o valor da chave, caso contrário será retornado uma condição especificada
    println(pedidos.getOrElse(0) { "Pedido inexistente" })

    // Retorna o valor da chave, caso contrário retorna um valor padrão
    println(pedidos.getOrDefault(1, null))
    println(pedidos.getOrDefault(1, -1.0))

    // Retorna o valor da chave, caso contrário retorna um valor padrão
    println(pedidos.getOrDefault(0, null))
    println(pedidos.getOrDefault(0, -1.0))

    // Exibe todas as chaves do Map
    println(pedidos.keys)
    for (numeroPedido in pedidos.keys) {
        println("Pedido: $numeroPedido")
    }

    // Exibe todos os valores do Map
    println(pedidos.values)
    for (valorPedido in pedidos.values) {
        println("Valor do Pedido: $valorPedido")
    }

    // Filtrar pela chave e pelo valor
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    // Filtrar pelos valores
    val pedidosPorValor = pedidos.filterValues { valor -> valor > 40.0 }
    println(pedidosPorValor)

    // Filtrar pelas chaves
    val pedidosPorNumero = pedidos.filterKeys { numero -> numero % 2 == 1 }
    println(pedidosPorNumero)

    println(pedidos)

    // Utilizando o operador +
    println(pedidos + Pair(9, 15.0))
    println(pedidos + mapOf(9 to 20.0, 1 to 25.0))
    println(pedidos)

    // Utilizando o operador -
    println(pedidos - 6)
    println(pedidos - listOf(6, 5, 10))
    println(pedidos)

    pedidos += listOf(9 to 20.0, 1 to 25.0)
    pedidos += setOf(9 to 30.0, 10 to 25.0)
//    pedidos.putAll(listOf(9 to 20.0, 1 to 25.0))
//    pedidos.putAll(setOf(9 to 30.0, 10 to 25.0))
    println(pedidos)

//   pedidos += Pair(11, 100.0)
    pedidos += 11 to 100.0
//    pedidos.put(11, 300.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(200.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 9
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)

    val pedido: Double? = pedidos[3]
    pedido?.let {
        println("Pedido: $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedido)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 100.0)
    println(pedidos)

    pedidos.remove(3, 50.0)
    println(pedidos)
}