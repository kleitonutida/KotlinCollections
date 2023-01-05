package arrays

fun main() {
    testMaiorIdadeIf()
    testMaiorIdadeArrayIf()
    testMaiorMenorIdadeArray()
}

fun testMaiorMenorIdadeArray() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade: Int = Int.MIN_VALUE
    for (idade: Int in idades) {
        if (maiorIdade < idade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade: Int = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)
}

fun testMaiorIdadeArrayIf() {
    val idades = IntArray(size = 4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20

    val maiorIdade: Int = if (idades[0] > idades[1] && idades[0] > idades[2] && idades[0] > idades[3]) {
        idades[0]
    } else if (idades[1] > idades[2] && idades[1] > idades[3]) {
        idades[1]
    } else if (idades[2] > idades[3]) {
        idades[2]
    } else {
        idades[3]
    }

    println(maiorIdade)
}

fun testMaiorIdadeIf() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade: Int = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println(maiorIdade)
}