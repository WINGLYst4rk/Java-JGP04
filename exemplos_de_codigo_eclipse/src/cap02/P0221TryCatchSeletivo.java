package cap02;

public class P0221TryCatchSeletivo {

	public static void main(String[] args) {

		try { // monitora qualquer exception

			int j = Integer.parseInt(args[0]); // converte o 1° primeiro argumento
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			// sinaliza a falta de argumentos
			System.out.println("Não foi fornecido um argumento.");
		} catch (NumberFormatException e2) {
			// sinaliza formato errado para o argumento
			System.out.println("Argumento não é um inteiro.");
		}

	}

}
