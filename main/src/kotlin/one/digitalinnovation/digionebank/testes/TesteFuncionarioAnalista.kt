package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){

    val joao = Analista("Joao Bosco", "12.300.234-66",2000.0)
   ImprimeRelatorioFuncionario.imprime(joao)
}

