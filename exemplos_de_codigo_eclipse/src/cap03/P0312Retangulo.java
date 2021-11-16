package cap03;

/*
 * por causa de usar uma excecao monitorada temos que colocar 
 * que cada metodo/construtor que pode lancar uma excecao o throws
 * isso se o metodo depender quem lanca a excecao
 */
public class P0312Retangulo {

	// dimensoes sao campos privados
	private double largura, altura;

	// construtor default aciona outro construtor com this
	public P0312Retangulo() throws Exception { // usando uma excecao monitorada
		this(2, 1);
	}

	// construtor parametrizado
	public P0312Retangulo(double larg, double alt) throws Exception { // usando uma excecao monitorada
		this.setTamanho(larg, alt);
	}

	public void setTamanho(double largura, double altura) throws Exception { // usando uma excecao monitorada
		if (largura >= 0 && altura >= 0) { // checando o valor das variaveis locais
			this.largura = largura; // uso implicito do this
			this.altura = altura;
		} else {
			// caso dimensoes invalidas lanca excecao monitorada
			throw new Exception("Dimensoes invalidas");
		}

	}

	public double getLargura() { // uso implicito do this: retorna o valor da largura
		return largura;
	}

	public double getAltura() { // uso implicito do this: retorna o valor da altura
		return altura;
	}

	@Override
	public String toString() {
		return "P0312Retangulo[largura=" + largura + ",altura=" + altura + "]";
	}
}
