package br.com.digitalhouse.thais

open class DigitalHouseManager (var listaDeAluno: Aluno, var listaDeProfessor: Professor, var listaDeCurso: Curso, var listaDeMatricula: Matricula) {

    open fun cadastrarCurso(nome: String, codigoDoCurso: Int, limiteDeAluno: Int){

        val novoCurso= cadastrarCurso(nome,codigoDoCurso,limiteDeAluno)
        listaDeCurso.add(novoCurso)
    }

    fun excluirCurso(codigoDoCurso: Int){

        if (codigoDoCurso.equals(listaDeCurso)){
            listaDeCurso.remove(codigoDoCurso)
            println("Curso removido com sucesso!")
        }
        else{
            println("Curso não encontrado")
        }
    }

    private fun cadastrarProfessorAdjunto(nome: String, sobrenome: String, codigoDoProfessorAdjunto: Int, horasDeMonitoria: Int){

        val novoProfessorAdjunto = cadastrarProfessorAdjunto(nome,sobrenome,codigoDoProfessorAdjunto,horasDeMonitoria)
        listaDeProfessor.add(novoProfessorAdjunto)
        println("Professor Adjunto cadastrado com sucesso!")
    }

    fun cadastrarProfessorTitular(nome: String, sobrenome: String, codigoDoProfessorTitular: Int, especialidade: String){

        val novoProfessorTitular = cadastrarProfessorTitular(nome, sobrenome,codigoDoProfessorTitular, especialidade)
        listaDeProfessor.add(novoProfessorTitular)
        println("Professor Adjunto cadastrado com sucesso!")
    }

    fun excluirProfessor(codigoDoProfessor: Int){
        if (codigoDoProfessor.equals(listaDeProfessor)){
            listaDeCurso.remove(codigoDoProfessor)
            println("Professor removido com sucesso!")
        }
        else{
            println("Professor não encontrado")
        }
    }

     fun matricularAluno(nome: String, sobrenome: String, codigoDeAluno: Int){

        val novoAluno = Aluno(nome,sobrenome,codigoDeAluno)
        listaDeAluno.add(novoAluno)
        println("Aluno matriculado com sucesso!")
    }

     fun matricularAlunoAoCurso (codigoDeAluno: Int, codigoDoCurso: Int, nome: String, sobrenome: String){

         if(codigoDoCurso.equals(listaDeCurso)){
             if (codigoDeAluno.equals(listaDeAluno)) {
                 matricularAluno()
                 listaDeMatricula.add(codigoDeAluno)
                 adicionarAlunoAoCurso()
             }
         }
         else{
             println("ERRO: tente novamente")
         }
    }

    fun alocarProfessoresAoCurso (codigoDoCurso: Int, codigoDoProfessorTitular: Int, codigoDoProfessorAdjunto: Int) {

        if(listaDeProfessor.equals(codigoDoProfessorTitular)){
            println("Professor encontrado")
        }
        else if(listaDeProfessor.equals(codigoDoProfessorAdjunto)) {
            println("Professor encontrado")
            //Curso.add(professorTitular, professorAdjunto)
        }
        else{
            println("ERRO: não foi possível encontrar os professores")
        }
    }

}






