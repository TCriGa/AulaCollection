package Exercicio04

class Retangulo(
    private var base: Double = 0.0,
    private var altura: Double = 0.0
) : Quadrilateros() {
    override fun calculoPerimetro(): Double {
        println("O valor do perímetro de base = $base e altura = $altura é = ")
        return 2 * (base + altura)
    }

    override fun calculoArea(): Double {
        println("A área do Retângulo de $base e $altura é = ")
        return base * altura

    }

    fun dadosRetangulo() {
        println("Informe o valor da base do Retângulo")
        base = readln().toDouble()
        println("Informe o valor da altura do Retângulo")
        altura = readln().toDouble()
        MenuFGeometricas().listaFormas.add(Retangulo(base, altura))
    }
}