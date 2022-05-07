package Exercicio05

const val tranquilo = "Tranquilo"
const val dificil = "dificil"
const val sao = "sao"
const val certo = " certo"
const val corajoso = " corajoso"
const val justo = " justo"


class DicionarioAntonimos {

    val antonimo = mapOf(
        tranquilo to "nervoso",
        dificil to "fácil",
        sao to "doente",
        certo to "errado",
        corajoso to "covarde",
        justo to "tendencioso"
    )
}