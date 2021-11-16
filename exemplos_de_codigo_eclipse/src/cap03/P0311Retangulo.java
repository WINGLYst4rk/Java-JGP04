package cap03;

/*
 * no caso de uma excecao nao monitorada nao precisa usar o throws para usar a excecao
 */
public class P0311Retangulo {

	// campos de dimensoes sao privados
	private double largura, altura;

	// construtor default aciona outro construtor com o this
	public P0311Retangulo() {
		this(2, 1);
	}

	public P0311Retangulo(double largura, double altura) {
		this.setTamanho(largura, altura);
	}

	public void setTamanho(double largura, double altura) {
		// verifica valor das variaveis locais
		if (largura >= 0 && altura >= 0) {
			// uso explicito de this
			this.largura = largura;
			this.altura = altura;
		} else {
			// se as dimensoes forem invalidas lanca excecao nao monitorada
			throw new RuntimeException("Dimensoes invalidas.");
		}
	}

	public double getLargura() { // uso implicito de this | retorna o valor da largura
		return largura;
	}

	public double getAltura() { // uso implicito de this | retorna o valor da altura
		return altura;
	}

	@Override
	public String toString() {
		return "P0311Retangulo[largura= " + largura + ", altura= " + altura + "]";
	}
}
