enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)
    
    val formacao = Formacao("Análise e Desenvolvimento de Sistemas", listOf(conteudo1, conteudo2))
    
    formacao.matricular(usuario1) // Matricula o primeiro usuário
    formacao.matricular(usuario2) // Matricula o segundo usuário
    
    println("Usuários inscritos na formação '${formacao.nome}': ${formacao.inscritos.size}")
}
