package BlocosDeInicalizacao.test;

import BlocosDeInicalizacao.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        for (int ep : anime.getEp()) {
            System.out.println(ep + " ");
            
        }

    }
}
