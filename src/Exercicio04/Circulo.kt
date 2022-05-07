package Exercicio04

import kotlin.math.pow

class Circulo(private var raio: Double = 0.0) : FormaGeometrica {
    override fun calculoPerimetro(): Double {
        println("O valor da perímetro de raio $raio é =")
        return 2 * Math.PI * raio
    }

    override fun calculoArea(): Double {
        println("O valor da área do raio $raio é =")
        return Math.PI * raio.pow(2.0)
    }

    fun dadosCirculo() {
        println("Informe o valor do raio do círculo")
        raio = readln().toDouble()
        MenuFGeometricas().listaFormas.add(Circulo(raio))
    }
}

