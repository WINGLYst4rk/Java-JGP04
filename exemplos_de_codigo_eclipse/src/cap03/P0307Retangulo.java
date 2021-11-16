package cap03;

public class P0307Retangulo {
	// campos dimensoes privados
	private double largura, altura;
	
	// construtor default aciona outro construtor
	public P0307Retangulo() {
		this(2, 1);
	}
	
	// construtor parametrizado
	public P0307Retangulo(double largura, double altura) {
		this.setTamanho(largura, altura);
		
	}
	
	// metodos
	public void setTamanho(double largura, double altura) {
		
		if (largura >= 0 && altura >= 0) { // verifica valor dos parametros
			
			// campos recebem valor das variaveis locais
			this.largura = largura; // uso explicito de this
			this.altura = altura;
		}
	}
	
	// retorna o valor da largura
	public double getLargura() {
		return largura;
	}
	 // retorna o valor da altura
	public double getAltura() {
		return altura;
	}
}
