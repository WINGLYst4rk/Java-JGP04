package cap02.exercicios;

import java.util.Scanner;

public class Q0208CalculoMontante {

	/*
	 * Objetivo: Dado um montante desejado e uma quantia fixa mensal exiba quantos
	 * meses será necessário para acumular o montante.
	 * 
	 * Constante: Taxa: 0,5%.
	 * 
	 * Entrada: Dois valores, um para o deposito fixo e outro para o montante
	 * desejado.
	 * 
	 * Saída: Quantidade de meses necessário para acumular o montante de acordo com
	 * a taxa.
	 * 
	 * OBS: Usando para calcular o calendario contabil.
	 */

	public static void main(String[] args) {

		final float taxa = 1.005f;

		double montante = 0;
		double deposito = 0;
		double valor = 0;
		int totalMeses = 0;
		//int meses = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade depositada todo mês: ");
		deposito = sc.nextDouble();

		System.out.print("Digite o montante desejado no final: ");
		montante = sc.nextDouble();

	/*
	 * calculo
	 * 
	 * m = c * (1 + t) ^ n
	 * 
	 * 
	 */
		do {
			valor += deposito * taxa;
			totalMeses++;
		} while(valor <= montante);
		
		System.out.printf("O total de meses para o deposito: %,.2f, para obter o montante de %,.2f é: %2d", deposito,
				montante, totalMeses);

		sc.close();
	}
}
