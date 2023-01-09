package br.com.alura.collections

fun testaCopia() {
    val banco: BancoDeNomes = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes() {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    println(nomes)

    for (nome in nomes.iterator()) {
        println(nome)
    }

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção: ${nomes.size}")
}