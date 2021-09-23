package cap02;

public class P018Continue {

	public static void main(String[] args) {
		
		int soma = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) { // verifica se i é multiplo de 2, 3 ou 5
				System.out.println("i = " + i + " multiplo de 2, 3 ou 5");
				continue;// pula essa interação caso seja multiplo
			}
			
			// soma os que não são multiplos
			soma = soma + i;
			System.out.println("i = " + i + " soma = " + soma);
		}
		
	}
	
}
