package Associacao.projeto.domain;

public class Aluno {
    private String nome;
    private double idade;
    private Seminario seminario;

    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, double idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }


}
