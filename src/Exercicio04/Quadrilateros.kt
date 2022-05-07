package Exercicio04

abstract class Quadrilateros(
    private var ladoA: Double = 0.0,
    private var ladoB: Double = 0.0,
    private var ladoC: Double = 0.0,
    private var ladoD: Double = 0.0
) : FormaGeometrica {

    override fun calculoPerimetro(): Double {
        println("O valor do perímetro do quadrilátero é = ")
        return ladoA + ladoB + ladoC + ladoD
    }


}