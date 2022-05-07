package Exercicio04

import kotlin.math.pow

class Quadrado(private var lado: Double = 0.0) : Quadrilateros() {

    override fun calculoPerimetro(): Double {
        println("A área do quadrado de lado = $lado é = ")
        return 4 * lado
    }

    override fun calculoArea(): Double {
        println("O perímetro do quadrado de lado = $lado é = ")
        return lado.pow(2)
    }

    fun dadosQuadrado() {
        println("Informe o valor do lado do quadrado")
        lado = readln().toDouble()
        MenuFGeometricas().listaFormas.add(Quadrado(lado))

    }
}