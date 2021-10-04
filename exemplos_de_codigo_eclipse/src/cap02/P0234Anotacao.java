package cap02;

public class P0234Anotacao {

	public static void main(String[] args) {

		System.out.println("Valor aleatorio: " + Anotacoes.random());
	}
}

class Anotacoes {
	@Deprecated // avisa que o m�todo n�o deve ser utilizado por ser depreciado
	public static double random() {
		return Math.random();
	}

	@Override // sobrescreve um m�todo da classe m�e
	@SuppressWarnings("unused") // n�o notifica sobre avisos da categoria dentro dos parenteses
	public String toString() {
		int x; // variavel sem uso qual n�o recebe aviso por causa da anota��o de supre��o
		return "ExemploAnota��o";
	}
}
