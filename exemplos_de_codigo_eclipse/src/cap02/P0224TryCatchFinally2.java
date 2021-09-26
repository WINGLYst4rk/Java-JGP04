package cap02;

import java.io.*;

public class P0224TryCatchFinally2 { // causa erro por não ter nenhum arquivo ou argumento

	public static void main(String[] args) {

		InputStream recurso = null; // representa uma entrada de argumentos

		try {
			recurso = new FileInputStream(args[0]); // entrada de argumentos atraves de um arquivo
			// uso do recurso
			System.out.println("Arquivo " + args[0] + " aberto.");

		} catch (IOException e1) {
			// tratamento de erro na obtencao do recurso
			System.out.println(e1);
		} finally {
			if (recurso != null) // verefica se o recurso foi fechado de forma adequada
				try {
					recurso.close();
					System.out.println("Arquivo " + args[0] + " fechado.");
				} catch (IOException e2) {
				}
		}
	}
}
