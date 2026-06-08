package Sobrecarga.dominio;

public class Anime {

    private String genero;
    private String nome;
    private String tipo;
    private int ep;

    public Anime(String nome,String tipo, int ep){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.ep = ep;
    }

    public Anime(String nome,String tipo, int ep,String genero){
        this(nome,tipo,ep);
        this.genero = genero;

    }

    public Anime(){

    }

    public void imprit(){
        System.out.println(this.nome = nome);
        System.out.println(this.tipo = tipo);
        System.out.println(this.ep = ep);
        System.out.println(this.genero = genero);
    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
