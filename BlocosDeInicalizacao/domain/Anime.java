package BlocosDeInicalizacao.domain;

public class Anime {
    private String nome;
    private int[] ep;
    {
        System.out.println("Dentro do bloco de inicialização");
        ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int ep : this.ep){
            System.out.println(ep + " ");
        }
        System.out.println();
    }

    public int[] getEp() {
        return ep;
    }

    public void setEp(int[] ep) {
        this.ep = ep;
    }
}
