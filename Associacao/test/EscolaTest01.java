package Associacao.test;

import Associacao.domain.Escola;
import Associacao.domain.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor = new Professor("Professor Girafalles");
        Professor[] professors = {professor};
        Escola escola = new Escola("ECIT", professors);
        escola.imprimi();

    }
}
