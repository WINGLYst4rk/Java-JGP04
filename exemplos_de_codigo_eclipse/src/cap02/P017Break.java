package cap02;

import java.util.Scanner;

public class P017Break {

	public static void main(String[] args) {

		// leitura do maximo de pares
		System.out.print("Maximo de pares? ");
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();
		int pares = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 2 == 0) { // verefica se é multiplo de 2
				pares++;
				System.out.printf("i = %4d pares = %4d%n", i, pares);
			}
			if (pares == max) { break; } // para o loop se alcançar o maximo
		}
		sc.close();

	}

}
