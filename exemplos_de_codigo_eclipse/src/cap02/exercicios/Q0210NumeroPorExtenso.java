package cap02.exercicios;

public class Q0210NumeroPorExtenso {

	/*
	 * Objetivo: Programa capaz de imprimir no console por extenso um número por extenso
	 * no intervalo de [0 - 49] qualquer valor fora desse parametro deve ser desconsiderado
	 * e uma mensagem de erro adeguada deve ser exibida
	 * 
	 * Entrada: Um número entre [0-49] inteiro
	 * 
	 * Saída: o número recebido por extenso no console
	 */
	
	public static void main(String[] args ) {
		
		String[] unidade = new String[10];
		String[] dezena = new String[7];
		String[] subDezena = new String[10];
		
		subDezena[0] = "dez";
		subDezena[1] = "onze";
		subDezena[2] = "doze";
		subDezena[3] = "treze";
		subDezena[4] = "quartoze";
		subDezena[5] = "quinze";
		subDezena[6] = "dezeseis";
		subDezena[7] = "desesete";
		subDezena[8] = "dezoito";
		subDezena[9] = "dezenove";
		
		unidade[0] = "zero";
		unidade[1] = "um";
		unidade[2] = "dois";
		unidade[3] = "três";
		unidade[4] = "quatro";
		unidade[5] = "cinco";
		unidade[6] = "seis";
		unidade[7] = "sete";
		unidade[8] = "oito";
		unidade[9] = "nove";
		
		dezena[0] = "vinte";
		dezena[0] = "trinta";
		dezena[0] = "quarenta";
		dezena[0] = "cinquenta";
		dezena[0] = "sesenta";
		dezena[0] = "setenta";
		dezena[0] = "oitenta";
		dezena[0] = "noventa";
	
		
		try {
			
			
		}catch(NumberFormatException e) {
			
		}
		
	}
}
