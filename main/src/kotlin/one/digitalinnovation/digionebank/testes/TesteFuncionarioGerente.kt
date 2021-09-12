package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){

    val jose = Gerente("Jose Silva", "12.300.234-66",5000.0)
    ImprimeRelatorioFuncionario.imprime(jose)
}

