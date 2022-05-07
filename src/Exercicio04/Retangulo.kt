package Exercicio04

class Retangulo(
    private var base: Double = 0.0,
    private var altura: Double = 0.0
) : Quadrilateros() {
    override fun calculoPerimetro(): Double {
        println("O valor do per�metro de base = $base e altura = $altura � = ")
        return 2 * (base + altura)
    }

    override fun calculoArea(): Double {
        println("A �rea do Ret�ngulo de $base e $altura � = ")
        return base * altura

    }

    fun dadosRetangulo() {
        println("Informe o valor da base do Ret�ngulo")
        base = readln().toDouble()
        println("Informe o valor da altura do Ret�ngulo")
        altura = readln().toDouble()
        MenuFGeometricas().listaFormas.add(Retangulo(base, altura))
    }
}