package Exercicio04

import kotlin.system.exitProcess

class MenuFGeometricas : Quadrilateros() {
    override fun calculoArea(): Double {
        return super.calculoPerimetro()
    }

    val listaFormas = mutableListOf<FormaGeometrica>()
    private val retangulo = Retangulo()
    private val quadrado = Quadrado()
    private val circulo = Circulo()

    init {
        println("|------------Bem vindo ao sistema Formas Geométricas------------|")
    }

    private fun menuFormas() {
        println("|------------Informe qual forma geométrica deseja criar:---------| ")
        println("|------------01- Quadrado ---------------------------------------| ")
        println("|------------02- Retângulo --------------------------------------| ")
        println("|------------03- Círculo ----------------------------------------| ")
        println("|------------04- Sair -------------------------------------------| ")
    }

    fun opcaoMenu() {
        do {
            menuFormas()
            when (readln().toInt()) {
                1 -> {
                    quadrado.dadosQuadrado()
                    println(quadrado.calculoArea())
                    println(quadrado.calculoPerimetro())
                }
                2 -> {
                    retangulo.dadosRetangulo()
                    println(retangulo.calculoArea())
                    println(retangulo.calculoPerimetro())
                }
                3 -> {
                    circulo.dadosCirculo()
                    println(circulo.calculoArea())
                    println(circulo.calculoPerimetro())
                }
                4 -> {
                    println("Grata por utilizar o nosso sistema!! :D")
                    exitProcess(0)
                }
                else -> println("Opção inválida. Digite novamente!! xD")


            }
        } while (true)

    }
}