package arrays

fun main() {

    val serie: IntRange = 1..10
    for (s: Int in serie) {
        print("$s ")
    }
    println()

    val numerosPares: IntProgression = 0.until(100) step 2
    for (numerosPar: Int in numerosPares) {
        print("$numerosPar ")
    }
    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach {
        print("$it ")
    }
    println()

    val intervalo: ClosedFloatingPointRange<Double> = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)

}