package Exercicio03

class GuardaVolumes() {

    val guardarPecas = mutableMapOf<Int, MutableList<Peca>>()
    var contador = 0
    var numero: Int = 0

    fun inserirPecas(listadePeca: MutableList<Peca>): Int {
        contador++
        guardarPecas[contador] = listadePeca.toMutableList()
        return contador
    }

    fun guardarPeca(listadePeca: MutableList<Peca>) {
        inserirPecas(listadePeca.toMutableList())

    }



    fun mostrarPeca() {
        guardarPecas.forEach { i, valor ->
            println("$ Referente ao nº $i")
            valor.forEachIndexed { index, peca ->
                println(peca.modelo)
                println(peca.marca)

            }

        }

    }

    fun mostrarPeca(numero: Int) {
        guardarPecas[numero]?.forEach {
            it.marca
            it.modelo
        }
    }


    fun retirarPeca() {
        println("Qual peça deseja o nº da referência de peça que deseja retirar?")
        numero = readln().toInt()
        guardarPecas.remove(numero)
    }

}