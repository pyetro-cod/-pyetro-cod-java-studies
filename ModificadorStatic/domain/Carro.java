package ModificadorStatic.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimit = 250;

    public Carro(String nome,double velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public  void imprimi(){
        System.out.println("--------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velocidadeMax);
        System.out.println("Velocidade Limite: "+ Carro.velocidadeLimit);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public static double getVelocidadeLimit() {
        return Carro.velocidadeLimit;
    }
    public static void setVelocidadeLimit(double velocidadeLimit){
        Carro.velocidadeLimit = velocidadeLimit;
    }

}
