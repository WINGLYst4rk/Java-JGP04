package cap02.exercicios;

import java.util.Arrays;

public class Q0207TryCatch {

	public static void main(String[] args) {
		/*
		 * Objetivo: somar todos números inteiros e reais desconsiderando os que não atendem a condição
		 * sem causar erro ou exceção.
		 * 
		 * Entrada: Números vindo de args[i]
		 * Saída: um array com a soma
		 * 
		 * Bônus: Mostrar todos os numeros usados
		 */

		double soma = 0;
		int tamanho = args.length;
		double[] todosNumeros = new double [tamanho];
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("\nArgumento #%d: %s ", i, args[i]);
			
			try {
				todosNumeros[i] = Double.parseDouble(args[i]);
				soma += Integer.parseInt(args[i]);
				System.out.print("É inteiro.");
				
			} catch (NumberFormatException e) {
				
				try {
					todosNumeros[i] = Double.parseDouble(args[i]);
					soma += Double.parseDouble(args[i]);
					System.out.print("É real.");
					
				} catch (NumberFormatException e1) {
					System.out.print("Não é real e nem inteiro.");
				}
				
			} catch (ArrayIndexOutOfBoundsException e2) {
				
			}
		}
		
		System.out.println("\n" + Arrays.toString(todosNumeros));
		System.out.printf("\nA soma de todos os números é: %,.2f%n", soma);
		
	}
}
