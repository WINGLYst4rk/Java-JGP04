package cap02;

public class P0234Anotacao {

	public static void main(String[] args) {

		System.out.println("Valor aleatorio: " + Anotacoes.random());
	}
}

class Anotacoes {
	@Deprecated // avisa que o método não deve ser utilizado por ser depreciado
	public static double random() {
		return Math.random();
	}

	@Override // sobrescreve um método da classe mãe
	@SuppressWarnings("unused") // não notifica sobre avisos da categoria dentro dos parenteses
	public String toString() {
		int x; // variavel sem uso qual não recebe aviso por causa da anotação de supreção
		return "ExemploAnotação";
	}
}
