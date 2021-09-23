package cap02;

import java.util.Scanner;

public class P0205SaidaFormatada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("No final ? ");

		int limite = sc.nextInt();

		int soma = 0;

		for (int i = 0; i <= limite; i++) {

			System.out.printf("%3da. Soma parcial = %6d%n", i, soma);
			soma += i;

		}

		System.out.printf("Soma total[0..%3d] = %6d%n", limite, soma);

		sc.close();
	}

}
