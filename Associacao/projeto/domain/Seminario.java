package Associacao.projeto.domain;

public class Seminario {
    private String tituto;
    private Aluno[] alunos;
    private Local local;

    public Seminario(){

    }

    public Seminario(String tituto, Aluno[] alunos) {
        this.tituto = tituto;
        this.alunos = alunos;
    }

    public Seminario(String tituto, Aluno[] alunos, Local local) {
        this.tituto = tituto;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTituto() {
        return tituto;
    }

    public void setTituto(String tituto) {
        this.tituto = tituto;
    }
}
