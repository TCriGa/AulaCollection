package Exercicio05

fun main() {
    val dicionarioAntonimos = DicionarioAntonimos()

    dicionarioAntonimos.antonimo.forEach{
        print("${it.key} =>")
        println(" antônimo = ${it.value}")

    }

}

