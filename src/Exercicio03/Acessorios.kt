package Exercicio03

class Acessorios :Peca(){
    override fun retirada() {
        println("Acess�rio retirado")
    }
    fun informarQtd() {
       try {
           println("Informe a quantidade de pe�as que deseja guardar")
           qtd = readln().toInt()
       } catch (ex:Exception){
           ex.message
           println("Quantidade inv�lida. Por favor, infome novamente")
           qtd = readln().toInt()
       }

    }

    fun inserirDados() : MutableList<Acessorios> {
        val listaAcessorios = mutableListOf<Acessorios>()

            for (i in 1..qtd) {
                println("Informe a marca da pe�a:")
                marca = readln()

                println("Informe o modelo da pe�a")
                modelo = readln()

                val newAcessorios = Acessorios()
                newAcessorios.marca = marca
                newAcessorios.modelo = modelo
                listaAcessorios.add(newAcessorios)

            }

        return  listaAcessorios
    }
}