package br.com.alura

fun main() {

    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

//    val assistiramAmbos = mutableListOf<String>()
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos.distinct())
}