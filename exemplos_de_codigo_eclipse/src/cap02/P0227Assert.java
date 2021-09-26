package cap02;

import java.util.Scanner;

public class P0227Assert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Forneça inteiro > 9: ");
		int valor = sc.nextInt();

		assert valor > 9;
		int soma = 0;

		for (int i = 1; i < valor; i++) {
			soma += i;
			assert soma < 99 : "soma(" + soma + ") >= 99";
		}
		System.out.println("Soma[1.." + valor + "] = " + soma);
		sc.close();
	}
}
