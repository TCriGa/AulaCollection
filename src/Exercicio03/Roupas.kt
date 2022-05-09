package Exercicio03

class Roupas : Peca() {
    override fun retirada() {
        println("Retirado com Sucesso")
    }

    fun informarQtd() {
        qtd = try {
            println("Informe a quantidade de pe�as que deseja guardar")
            readln().toInt()
        } catch (ex: Exception) {
            ex.message
            println("Quantidade inv�lida. Por favor, infome novamente")
            readln().toInt()
        }


    }

    fun inserirDados():MutableList<Roupas>  {

        val listaRoupas = mutableListOf<Roupas>()

        for (i in 1..qtd) {
            println("Informe a marca da pe�a:")
            marca = readln()

            println("Informe o modelo da pe�a")
            modelo = readln()

            val newRoupas = Roupas()
            newRoupas.modelo = modelo
            newRoupas.marca = marca
            listaRoupas.add(newRoupas)

        }
        return listaRoupas
    }

}
