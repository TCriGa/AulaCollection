package Exercicio05

fun main() {
    val dicionarioAntonimos = DicionarioAntonimos()

    dicionarioAntonimos.antonimo.forEach{
        print("${it.key} =>")
        println(" ant�nimo = ${it.value}")

    }

}

