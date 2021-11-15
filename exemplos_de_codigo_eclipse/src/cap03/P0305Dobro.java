package cap03;

public class P0305Dobro {
	/*
	 * Classe para representacao de menbros estaticos e nao estaticos
	 */

	// armazena número de instancias da classe
	private static int instancias = 0;

	// armazena ultimo valor usado pelo metodo dobro(int)
	public int ultimoValor = 0;

	public P0305Dobro() {
		instancias++;
	}

	// retorna o numero de instancias
	public static int getInstancias() {

		return instancias;
	}

	// calculando o dobro
	public int dobro(int valor) {
		ultimoValor = valor;
		return 2 * valor;
	}

}
