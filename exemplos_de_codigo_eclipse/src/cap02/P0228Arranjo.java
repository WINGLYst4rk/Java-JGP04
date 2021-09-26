package cap02;

import java.util.Scanner;

public class P0228Arranjo {

	public static void main(String[] args) {

		int a[] = new int[10]; // declaração e alocação do arranjo inteiro

		Scanner sc = new Scanner(System.in); // prepara a entrada de dados
		for (int i = 0; i < a.length; i++) { // lê valores para o arranjo
			System.out.println("a[" + i + "]? ");
			a[i] = sc.nextInt();
		}
		int soma = 0; // exibe arranjo e soma seus elementos
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			soma += a[i];
		}
		System.out.println("Soma = " + soma); // exibe a soma dos elementos
		sc.close();
	}
}
