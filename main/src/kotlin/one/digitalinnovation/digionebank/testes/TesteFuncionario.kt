package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val jota = Pessoa(nome = "Jota da Silva", cpf = "20.300.234-35")

    println(jota.nome)
    println(jota.cpf)

    val joao = Funcionario("Joao Bosco", "12.300.234-66", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}