package Exercicio02

fun main() {
    val listaNumeros = mutableSetOf<Int>()
    val novaListaN = mutableSetOf(1,5,5,6,7,8,8,8)
    listaNumeros.addAll(novaListaN)

    println(listaNumeros)
}