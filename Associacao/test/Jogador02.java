package Associacao.test;

import Associacao.domain.Jogador;
import Associacao.domain.Time;

public class Jogador02 {
    static void main() {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprimi();


    }

}
