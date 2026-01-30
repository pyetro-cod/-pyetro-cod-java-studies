package Enums;

import Enums.domain.StarEnum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var option = -1;
        while (option != 5){
            System.out.println("Escolha alguma operação matemática:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Finalizar");
            option = sc.nextInt();

            if (option > 5 || option < 1){
                System.out.println("Escolhar uma Opção válida");
                continue;
            }

            if (option == 5) return;

            var selectOption = StarEnum.values()[option - 1];
            System.out.println("Informe o primeiro valor: ");
            var v1 = sc.nextInt();
            System.out.println("Informe o segundo valor: ");
            var v2 = sc.nextInt();

            var result  = selectOption.getCalculate().apply(v1,v2);
//            System.out.printf("%s %s = %s%n", v1, selectOption.getSymbol(), v2, result);
            System.out.printf("Resultado: %d %s %d = %d%n", v1, selectOption.getSymbol(), v2, result);

        }

    }
}
