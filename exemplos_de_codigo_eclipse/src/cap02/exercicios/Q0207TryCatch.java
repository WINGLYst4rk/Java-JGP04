package cap02.exercicios;

import java.util.Arrays;

public class Q0207TryCatch {

	public static void main(String[] args) {
		/*
		 * Objetivo: somar todos n�meros inteiros e reais desconsiderando os que n�o atendem a condi��o
		 * sem causar erro ou exce��o.
		 * 
		 * Entrada: N�meros vindo de args[i]
		 * Sa�da: um array com a soma
		 * 
		 * B�nus: Mostrar todos os numeros usados
		 */

		double soma = 0;
		int tamanho = args.length;
		double[] todosNumeros = new double [tamanho];
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("\nArgumento #%d: %s ", i, args[i]);
			
			try {
				todosNumeros[i] = Double.parseDouble(args[i]);
				soma += Integer.parseInt(args[i]);
				System.out.print("� inteiro.");
				
			} catch (NumberFormatException e) {
				
				try {
					todosNumeros[i] = Double.parseDouble(args[i]);
					soma += Double.parseDouble(args[i]);
					System.out.print("� real.");
					
				} catch (NumberFormatException e1) {
					System.out.print("N�o � real e nem inteiro.");
				}
				
			} catch (ArrayIndexOutOfBoundsException e2) {
				
			}
		}
		
		System.out.println("\n" + Arrays.toString(todosNumeros));
		System.out.printf("\nA soma de todos os n�meros �: %,.2f%n", soma);
		
	}
}
