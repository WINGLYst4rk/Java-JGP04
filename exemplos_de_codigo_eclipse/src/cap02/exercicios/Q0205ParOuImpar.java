package cap02.exercicios;

import java.util.Scanner;

public class Q0205ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // prepara o console para receber dados

		System.out.print("Digite um inteiro: ");
		int num = sc.nextInt();

		// testa se � par ou impar
		if (num % 2 == 0) {
			System.out.printf("O n�mero %d � par.", num);
		} else {
			System.out.printf("O n�mero %d � impar.", num);
		}

		sc.close();
	}
}
