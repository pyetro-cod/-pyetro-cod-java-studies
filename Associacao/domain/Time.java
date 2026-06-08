package Associacao.domain;

public class Time {
    private String nome;


    public void imprimi(){
        System.out.println(this.nome);
    }

    public Time(String nome){
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
