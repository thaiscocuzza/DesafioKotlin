package br.com.digitalhouse.thais

data class Curso(val nome: String, val codigoDoCurso: Int, val limiteDeALunos: Int){

    val listaDeAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarAluno (aluno: Aluno): Boolean{

        if (listaDeAlunosMatriculados.size < limiteDeALunos){
            listaDeAlunosMatriculados.add(aluno)
            return true
        }
        else {
            return false
        }
    }

    fun excluirAluno(aluno: Aluno){
        listaDeAlunosMatriculados.remove(aluno)
        println("Aluno removido da lista com sucesso!")
    }

}


