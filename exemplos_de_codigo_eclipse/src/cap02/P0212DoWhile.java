package cap02;

import java.util.Scanner;

public class P0212DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Valor inteiro inferior? ");
		int min = sc.nextInt();

		System.out.println("Valor inteiro superior? ");
		int max = sc.nextInt();

		do {
			System.out.println(min + " < " + max);
			min++;
			max--;
		} while (min < max);

		System.out.println(min + " == " + " Condição Final!");

		sc.close();
	}

}
