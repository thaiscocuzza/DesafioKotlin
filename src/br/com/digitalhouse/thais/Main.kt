package br.com.digitalhouse.thais

fun main() {

    val novoProfessorTitular1 = ProfessorTitular("IOS","Jose","Professor", 1,10)
    val novoProfessorTitular2 = ProfessorTitular("ANDROID","João","Professor", 1,11)
    val novoProfessorAdjunto1 = ProfessorAdjunto(5,"Flavia","Professor", 0,20)
    val novoProfessorAdjunto2 = ProfessorAdjunto(6,"Ana","Professor", 0,21)

    cadastrarProfessorTitular(novoProfessorTitular1)
    cadastrarProfessorTitular(novoProfessorTitular2)
    cadastrarProfessorAdjunto(novoProfessorAdjunto1)
    cadastrarProfessorAdjunto(novoProfessorAdjunto2)

    val novoCurso1 =cadastrarCurso("Full Stack",20001, novoProfessorTitular1, novoProfessorAdjunto1,3)
    val novoCurso2 =cadastrarCurso("Android",20002,novoProfessorTitular2,novoProfessorAdjunto2,2)

    alocarProfessoresAoCurso(novoCurso1)
    alocarProfessoresAoCurso(novoCurso2)

    val aluno1 = Aluno("Thais","Cocuzza",1001)
    val aluno2 = Aluno("Vitor","Horvath",1002)



}


