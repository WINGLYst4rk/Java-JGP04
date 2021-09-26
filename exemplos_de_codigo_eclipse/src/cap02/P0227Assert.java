package cap02;

import java.util.Scanner;

public class P0227Assert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // entrada de dados

		System.out.print("Forne�a inteiro > 9: ");
		int valor = sc.nextInt(); // l� valor inteiro

		assert valor > 9; // esperado valor maior que 9
		int soma = 0; // declara vari�vel para soma

		for (int i = 1; i < valor; i++) { // realiza la�o para efetuar soma
			soma += i;
			assert soma < 99 : "soma(" + soma + ") >= 99"; // esperado soma < 99
		}
		System.out.println("Soma[1.." + valor + "] = " + soma);
		sc.close();
	}
}
