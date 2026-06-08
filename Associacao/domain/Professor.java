package Associacao.domain;

import Associacao.projeto.domain.Seminario;

public class Professor {
    private String nome;
    private Seminario[] seminarios;

    public Professor(){

    }

    public Professor(String nome, Seminario[] seminarios) {
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
