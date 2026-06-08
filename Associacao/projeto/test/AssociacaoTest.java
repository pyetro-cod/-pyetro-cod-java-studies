package Associacao.projeto.test;

import Associacao.projeto.domain.Aluno;
import Associacao.projeto.domain.Local;
import Associacao.projeto.domain.Professor;
import Associacao.projeto.domain.Seminario;

public class AssociacaoTest {
    static void main(String[] args) {
        Local local = new Local("Rua do Abrigo");
        Aluno aluno = new Aluno("Pyetro", 17);
        Professor professor = new Professor("Kakashi", "Ninja");
        Aluno[] alunos = {aluno};

        Seminario seminario = new Seminario("Virar Hokage", alunos, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprimi();
    }
}
