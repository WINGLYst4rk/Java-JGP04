package cap02;

import java.util.Scanner;

public class P0211While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Valor inteiro inicial? ");
		int j = sc.nextInt();

		while (j >= 0) {
			System.out.println(j);
			j--;
		}

		sc.close();
	}

}
