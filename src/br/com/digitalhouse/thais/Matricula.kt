package br.com.digitalhouse.thais

import java.text.SimpleDateFormat

class Matricula( val aluno: Aluno, val curso: Curso, var dataDeMatricula: SimpleDateFormat) {

    init {
        println("Matrícula do aluno ${aluno.nome} ${aluno.sobrenome} realizada com sucesso no curso de ${curso.nome} no dia $dataDeMatricula")
    }
}