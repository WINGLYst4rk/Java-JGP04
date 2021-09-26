package cap02;

import java.io.IOException;
import java.io.StringReader;

public class P0226TryWithResources {

	public static void main(String[] args) {

		String s = "Java - Guia do Programador, 4a Ed."; // variável a ser processada
		processaRecurso(s);
	}

	public static void processaRecurso(String s) { // metodo para usar e processar o recurso
		StringReader recurso = new StringReader(s); // responsável por ler a variável
		try (recurso) {
			int espacos = 0, c;
			while ((c = recurso.read()) != -1) { // enquanto tiver algo na variável vontinuar a ler
				if (c == 32)
					espacos++; // contando espaços entre as palavras
			}
			System.out.println("Espaços = " + espacos);
		} catch (IOException e1) {
			// tratamento de erro no uso do recurso
		}
		System.out.println("Recurso processado.");
	}
}
