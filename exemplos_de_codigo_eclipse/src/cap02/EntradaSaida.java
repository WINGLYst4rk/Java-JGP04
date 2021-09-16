package cap02;

import java.util.Scanner; // inprtação do scanner

public class EntradaSaida {
	
	public static void main(String[] args) {
		
		System.out.println("Olá"); // menssagem inicial
		System.out.println("Digite um inteiro: "); // exibe menssagem
		
		Scanner s = new Scanner(System.in); // prepara a entrada de dados
		
		int valor = s.nextInt(); // ler e armazena o valor na variavel
		
		System.out.println("Valor = " + valor); // exibe o valor digitado
		
		s.close();
		
	}

}
