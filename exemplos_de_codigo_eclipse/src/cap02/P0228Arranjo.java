package cap02;

import java.util.Scanner;

public class P0228Arranjo {

	public static void main(String[] args) {

		int a[] = new int[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]? ");
			a[i] = sc.nextInt();
		}
		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			soma += a[i];
		}
		System.out.println("Soma = " + soma);
		sc.close();
	}
}
