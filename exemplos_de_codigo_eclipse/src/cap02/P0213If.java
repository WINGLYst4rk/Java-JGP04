package cap02;

public class P0213If {

	public static void main(String[] args) {

		if (args.length > 0) { // checa se tem algum argumento
			int max = Integer.parseInt(args[0]); // converte o 1º argumento em inteiro
			for (int j = 0; j < max; j++) { // faz a contagem de 0 ao numero
				System.out.print(j + " ");
			}
			System.out.println("\nFin da contagem");
		}
		System.out.println("Fim do programa");
	}

}
