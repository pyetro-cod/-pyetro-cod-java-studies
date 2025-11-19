package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class ex04lendoNuns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite um Núemro:");
        double num = sc.nextDouble();

        double metade = num / 2;
        double dobro = num * 2;
        double triplo = num * 3;

        System.out.printf("O dobro de %.2f é %.2f",num,dobro);
        System.out.println();
        System.out.printf("O triplo de %.2f é %.2f",num,triplo);
        System.out.println();
        System.out.printf("A métade de %.2f é %.2f",num,metade);

        sc.close();
    }
}
