package Associacao.test;

import Associacao.domain.Jogador;

public class Jogador01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Cafú");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador j : jogadores) {
            j.imprimi();
        }


    }
}
