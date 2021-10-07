package cap02.exercicios;

import java.util.Scanner;

public class Q0209MaiorDosTres {

	/*Objetivo: Receber 3 números e determinar qual é o maior deles
	 * 
	 * Entrada: 3 números reais
	 * 
	 * Saída: 1 número que seja maior que todos
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número real: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite um outro número real: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Digite outro número real: ");
		double num3 = sc.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O número %.2f", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("O número %.2f", num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.printf("O número %.2f", num3);
		}
		
		sc.close();
	}
	
}
