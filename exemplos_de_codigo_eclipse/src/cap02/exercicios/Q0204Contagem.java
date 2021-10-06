package cap02.exercicios;

import java.util.Scanner;

public class Q0204Contagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // prepara o console para receber dados

		System.out.print("Digite um número inteiro: ");
		int limite = sc.nextInt(); // armazena o inteiro

		System.out.printf("Contando de 0 até %d: ", limite); // informando limite da contagem
		for (int i = 0; i <= limite; i++) {
			System.out.printf("%n#%d", i); // mostrando a contagem
		}

		sc.close(); // fecha a entrada de dados
	}
}
