package cap02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class P0225TryWithResources { // causa erros por causa de n�o ter nenhum arquivo

	public static void main(String[] args) {

		try (InputStream recurso = new FileInputStream(args[0]);) {
			// uso do recurso
			System.out.println("Arquivo " + args[0] + " aberto.");
		} catch (IOException e1) {
			// tratamento de erro na obten��o do recuso
			System.out.println(e1);
		}
		System.out.println("Arquivo " + args[0] + " fechado.");

	}

}
