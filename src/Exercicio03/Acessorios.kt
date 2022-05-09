package Exercicio03

class Acessorios :Peca(){
    override fun retirada() {
        println("Acessório retirado")
    }
    fun informarQtd() {
       try {
           println("Informe a quantidade de peças que deseja guardar")
           qtd = readln().toInt()
       } catch (ex:Exception){
           ex.message
           println("Quantidade inválida. Por favor, infome novamente")
           qtd = readln().toInt()
       }

    }

    fun inserirDados() : MutableList<Acessorios> {
        val listaAcessorios = mutableListOf<Acessorios>()

            for (i in 1..qtd) {
                println("Informe a marca da peça:")
                marca = readln()

                println("Informe o modelo da peça")
                modelo = readln()

                val newAcessorios = Acessorios()
                newAcessorios.marca = marca
                newAcessorios.modelo = modelo
                listaAcessorios.add(newAcessorios)

            }

        return  listaAcessorios
    }
}