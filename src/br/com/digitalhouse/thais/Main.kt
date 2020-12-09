package br.com.digitalhouse.thais

fun main() {

    val secretaria = DigitalHouseManager()

    secretaria.cadastrarProfessorTitular("Tiago","Santos",10,"Android")
    secretaria.cadastrarProfessorTitular("Aline","Costa",11,"IOS")
    secretaria.cadastrarProfessorAdjunto("Paulo","Rocha",20,3)
    secretaria.cadastrarProfessorAdjunto("Ana","Souza",21,2)

    secretaria.cadastrarCurso("Full Stack",20001,3)
    secretaria.cadastrarCurso("Android", 20002,2)

    secretaria.alocarProfessorAoCurso(20001,10,20)
    secretaria.alocarProfessorAoCurso(20001,11,21)

    secretaria.matricularAluno("Thais","Cocuzza",501)
    secretaria.matricularAluno("Vitor","Horvath", 502)
    secretaria.matricularAluno("Isis","Camargo",503)
    secretaria.matricularAluno("Angelo", "Gomes",504)
    secretaria.matricularAluno("Fabio","Freitas",505)

    secretaria.matricularAluno(20001,501)
    secretaria.matricularAluno(20001,502)
    secretaria.matricularAluno(20002,503)
    secretaria.matricularAluno(20002,504)
    secretaria.matricularAluno(20002,505)


}


