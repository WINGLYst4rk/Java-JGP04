package cap02;

public class P0210ForAvancado {

	public static void main(String[] args) {

		double[] arranjo = { 1.1964, 6.1995, 6.1935, 7.1931, 12.1968 };

		// for comum
		System.out.println("For comum [ ");

		int tamanho = arranjo.length;

		for (int i = 0; i < tamanho; i++)
			System.out.println(arranjo[i] + " ");

		System.out.println("] Fim\n");

		// for avançado
		System.out.println("For avançado [ ");

		for (double elemento : arranjo)
			System.out.println(elemento + " ");

		System.out.println("] Fim");

	}

}
