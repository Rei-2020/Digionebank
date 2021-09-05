package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String ="Lara"
    var cpf: String ="094.452.448-22"
    private set

    constructor()
    fun pessoainfo() = "$nome e $cpf"
}
fun main(){
 val Lara = Pessoa()
    println(Lara. pessoainfo())

}