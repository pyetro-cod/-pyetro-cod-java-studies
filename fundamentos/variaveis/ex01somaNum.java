package fundamentos.variaveis;

import java.util.Locale;
import java.util.Scanner;

// Crie um programa que declare duas variáveis inteiras, some elas e imprima o resultado.
public class ex01somaNum {
	public static  void main (String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite um Número:");
		int num= sc.nextInt();
		
		System.out.println("Digite um Número:");
		int num2 = (int) sc.nextDouble();
		
		double soma = num + num2;
		System.out.printf("O Resultado da Soma dos Números Inteiros é %.2f", soma);
		sc.close();
	}
}
