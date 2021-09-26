package cap02;

import java.util.Scanner;

public class P0229ArranjoForAvancado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // prepara o console
		System.out.println("Nº de elementos ? ");

		int tamanho = sc.nextInt(); // lê nº de elementos

		assert tamanho > 0; // usa assert esperando ser > 0

		int arranjo[] = new int[tamanho]; // aloca arranjo

		for (int i = 0; i < tamanho; i++) { // for comum p/ ler elementos
			System.out.print("Elemento[" + i + "]? ");
			arranjo[i] = sc.nextInt();
		}

		sc.close();
		int soma = 0;
		System.out.println("[ ");
		for (int elemento : arranjo) { // for avançado para somar os elementos
			soma += elemento; // soma os elementos
			System.out.print(elemento + " ");
		}
		System.out.println("] soma = " + soma); // exibe a soma dos elementos
	}
}
