package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa


fun main(){
    val jose = Pessoa(nome = "Jose da Silva", cpf = "20.333.234-30")

    println(jose.nome)
    println(jose.cpf)

}