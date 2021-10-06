package cap02.exercicios;

import java.util.Scanner;

public class Q0203InteiroReal {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int i = sc.nextInt();
	
		System.out.print("Digite um real: ");
		double d = sc.nextDouble();
		
		System.out.printf("Número real: %.2f, Número Inteiro: %d", d, i);
		
		sc.close();
	}

}
