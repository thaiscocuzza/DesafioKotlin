package br.com.digitalhouse.thais

data class Curso(val nome: String, val codigoDoCurso: Int, val limiteDeALunos: Int){

    val listaDeAlunos = ArrayList<Aluno>()

    open fun adicionarAlunoAoCurso (aluno: Aluno): Boolean{

        if (listaDeAlunos.equals(limiteDeALunos)){
            println("ERRO: Não foi possível realizar a matrícula no curso, porque não há vagas")
            return false
        }
        else{
            listaDeAlunos.add(aluno)
            println("Aluno matrículado ao curso com sucesso!")
            return true
        }
    }

    open fun excluirAlunoDoCurso(aluno: Aluno){
        listaDeAlunos.remove(aluno)
        println("Aluno removido da lista com sucesso!")
    }

    fun add(listaDeCurso: Unit) {}

    fun remove(codigoDoCurso: Int) {}

}


