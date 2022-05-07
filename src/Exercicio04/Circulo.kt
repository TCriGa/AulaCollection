package Exercicio04

import kotlin.math.pow

class Circulo(private var raio: Double = 0.0) : FormaGeometrica {
    override fun calculoPerimetro(): Double {
        println("O valor da per�metro de raio $raio � =")
        return 2 * Math.PI * raio
    }

    override fun calculoArea(): Double {
        println("O valor da �rea do raio $raio � =")
        return Math.PI * raio.pow(2.0)
    }

    fun dadosCirculo() {
        println("Informe o valor do raio do c�rculo")
        raio = readln().toDouble()
        MenuFGeometricas().listaFormas.add(Circulo(raio))
    }
}

