package fundamentos.loops;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número da tabuda da soma:");
        var num = sc.nextInt();
        for (var i = 1; i <= 10; i++) {
            var soma = i + num;
            System.out.printf(" %s + %s = %s%n", num, i, soma);
        }
        System.out.println("-----------------------");
        sc.close();
    }
}

