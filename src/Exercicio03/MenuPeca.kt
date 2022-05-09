package Exercicio03

import kotlin.system.exitProcess

class MenuPeca {

    val guardaVolumes = GuardaVolumes()
    val acessorios = Acessorios()
    val roupas = Roupas()




    fun boasVindas() {
        println("|---------------Digite a opção desejada--------------------------------|")
        println("|---------------01 - Inserir Roupas -----------------------------------|")
        println("|---------------02 - Inserir Acessórios -----------------------------------|")
        println("|---------------03 - Retirar Roupas -----------------------------------|")
        println("|---------------04 - Mostrar roupas Guardadas -------------------------|")
        println("|---------------05 - Sair ---------------------------------------------|")
    }

    fun opcaoMenu() {

        do {
            boasVindas()
            try {
                when (readln().toInt()) {
                    1 -> {roupas.informarQtd()
                        val listaRoupas = roupas.inserirDados()
                        guardaVolumes.guardarPeca(listaRoupas.toMutableList())

                        opcaoMenu()
                    }

                    2 -> {
                        acessorios.informarQtd()
                        val listaAcessorios = acessorios.inserirDados()
                        guardaVolumes.guardarPeca(listaAcessorios.toMutableList())
                    }
                    3 ->guardaVolumes.retirarPeca()

                    4 -> {guardaVolumes.mostrarPeca()

                    }

                    5 -> {
                        println("Obrigada por utlizar nosso sistema!! :)")
                        exitProcess(0)
                    } else -> println("Opção inválida. Digite novamente")


                }
            } catch (ex: Exception) {
                ex.message
                println("Opção inválida. Digite novamente")
            }


        } while (true)
    }


}