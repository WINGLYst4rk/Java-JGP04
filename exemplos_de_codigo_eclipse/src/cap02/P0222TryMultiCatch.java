package cap02;

public class P0222TryMultiCatch {

	public static void main(String[] args) {

		try { // monitora eventuais problemas com multi-catch

			int j = Integer.parseInt(args[0]); // converte o 1° argumento
			while (j >= 0) {
				System.out.println(j);
				j--;
			}

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // usando a | para tratar multlipas
																				// exceptions
			// sinaliza falta de argumentos ou se o argumento e invalido
			System.out.println("Argumento não fornecido ou invalido");
		}
	}

}
