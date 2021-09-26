package cap02;

public class P0220TryCatch {

	public static void main(String[] args) {

		try { // testa se tem argumentos
				// caso não tenha argumentos lanca uma exception

			int j = Integer.parseInt(args[0]); // converte o 1º argumento em inteiro
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (Exception e) { // lanca a exception caso algum problema seja encontrado
			System.out.println("Argumento não foi fornecido ou não é inteiro");
		}
	}
}
