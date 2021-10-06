package cap02.exercicios;

import java.util.Scanner;

public class Q0206AreaPerimetro {

	public static void main(String [] args) {
		/*
		 * Entrada: dois numeros reais, um para a largura e outro para o comprimento
		 * Saida: o calculo da area e do perimetro de um terreno retangular
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura em metros: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento em metros: ");
		double comprimento = sc.nextDouble();
		
		double area = 0;
		double perimetro = 0;
		
		area = (largura * comprimento);
		perimetro = (largura * 2) + (comprimento * 2);
		
		System.out.printf("%nA àrea do terreno é: %.2fM", area);
		System.out.printf("%nO perímetro do terreno é: %.2fM", perimetro);
		
		
		sc.close();
	}

}
