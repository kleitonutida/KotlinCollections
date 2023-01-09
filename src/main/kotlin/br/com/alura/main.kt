package br.com.alura

fun main() {

    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")

    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}