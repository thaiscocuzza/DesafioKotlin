package br.com.digitalhouse.thais

import java.util.*

class DigitalHouseManager(var listaDeAluno: MutableList<Aluno> = mutableListOf<Aluno>(), var listaDeProfessor: MutableList<Professor> = mutableListOf<Professor>(), var listaDeCurso: MutableList<Curso> = mutableListOf<Curso>(), var listaDeMatricula: MutableList<Matricula> = mutableListOf<Matricula>()) {


    fun cadastrarCurso(nome: String, codigoDoCurso: Int, limiteDeAluno: Int) {

        val novoCurso = Curso(nome, codigoDoCurso, limiteDeAluno, )
        listaDeCurso.add(novoCurso)
    }

    fun excluirCurso(codigoDoCurso: Int) {
        for (curso in listaDeCurso) {
            if (codigoDoCurso == codigoDoCurso) {
                listaDeCurso.remove(curso)
                println("Curso removido com sucesso!")
            } else {
                println("Curso não encontrado")
            }
        }
    }

    fun cadastrarProfessorAdjunto(nome: String, sobrenome: String, codigoDoProfessorAdjunto: Int, horasDeMonitoria: Int) {

        val novoProfessorAdjunto = ProfessorAdjunto(horasDeMonitoria, nome, sobrenome, tempoDeCasa = 0, codigoDoProfessorAdjunto)
        listaDeProfessor.add(novoProfessorAdjunto)
        println("Professor Adjunto cadastrado com sucesso!")
    }

    fun cadastrarProfessorTitular(nome: String, sobrenome: String, codigoDoProfessorTitular: Int, especialidade: String) {

        val novoProfessorTitular = ProfessorTitular(especialidade, nome, sobrenome, tempoDeCasa = 0, codigoDoProfessorTitular)
        listaDeProfessor.add(novoProfessorTitular)
        println("Professor Titular cadastrado com sucesso!")
    }

    fun excluirProfessor(codigoDoProfessor: Int) {

        for (professor in listaDeProfessor) {
            if (codigoDoProfessor.equals(listaDeProfessor)) {
                listaDeCurso.remove(professor)
                println("Professor removido com sucesso!")
            } else {
                println("Professor não encontrado")
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoDeAluno: Int) {

        val novoAluno = Aluno(nome, sobrenome, codigoDeAluno)
        listaDeAluno.add(novoAluno)
        println("Aluno matrículado com sucesso!")
    }

    fun matricularAluno(codigoDoCurso: Int,codigoDeAluno: Int) {

        val aluno = Aluno(nome = " ", sobrenome = "", codigoDeAluno = 0)
        var alunoEncotrado: Aluno? = null
        var cursoEncontrado: Curso? = null
        val dataDaMatricula: Date

        for (aluno in listaDeAluno) {
            if (aluno.codigoDeAluno == codigoDeAluno) {
                println("Aluno encontrado!")
            }
        }
        for (curso in listaDeCurso) {
            if (curso.codigoDoCurso == codigoDoCurso) {
                println("Curso encontrado!")
            }
        }
        if (alunoEncotrado != null && cursoEncontrado != null) {
            cursoEncontrado.adicionarAluno(alunoEncotrado)
        } else {
            if (cursoEncontrado != null) {
                listaDeAluno.add(aluno)
                cursoEncontrado.adicionarAluno(aluno)
            }
            println("Matrícula realizada com sucesso!")
        }
    }

    fun alocarProfessorAoCurso(codigoDoCurso: Int, codigoDoProfessorTitular: Int, codigoDoProfessorAdjunto: Int) {

        //val cursoEncontrado: Curso? = null
        //val professorTitularEncontrado: ProfessorTitular? = null
        //val professorAdjuntoEncontrado: ProfessorAdjunto? = null

        for (curso in listaDeCurso) {
            if (curso.codigoDoCurso == codigoDoCurso) {
                println("Curso encontrado")
            }
        }
        for (professor in listaDeProfessor) {
            if (professor.codigoDeProfessor == codigoDoProfessorTitular && professor is ProfessorTitular) {
                println("Professor encontrado")
            }
            if (professor.codigoDeProfessor == codigoDoProfessorAdjunto && professor is ProfessorAdjunto) {
                println("Professor encontrado")
            }
            else{

            }
        }
    }
}







