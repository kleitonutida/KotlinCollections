package br.com.alura.list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf<Livro>(livro1, livro2, livro3, livro4)
    livros.imprimeComMarcadores()

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    livros.imprimeComMarcadores()

    livros.remove(livro3)
    livros.imprimeComMarcadores()

    val ordenadoPorPublicacao: List<Livro> = listaDeLivros.sorted()
    ordenadoPorPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo: List<Livro> = listaDeLivros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    listaDeLivros.sortedBy { it.autor }.imprimeComMarcadores()

    listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    listaDeLivros
        .filter { it.titulo.contains("vida") }
        .sortedBy { it.autor }
        .imprimeComMarcadores()

    val titulos = listaDeLivros
        .filter { it.anoPublicacao > 1900 }
        .sortedBy { it.titulo }
        .map { it.titulo }
    println("\n$titulos")
}
