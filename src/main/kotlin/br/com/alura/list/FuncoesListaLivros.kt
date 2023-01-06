package br.com.alura.list

fun List<Livro>.imprimeComMarcadores(){
    val listaFormatada = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("\n #### Lista de Livros ####\n$listaFormatada")
}