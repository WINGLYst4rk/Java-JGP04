package cap03;

public class P0304Ponto2D {
	// campos publicos sem restricao para valores dde x e de y
	public double x, y;
	
	// construtor padrao: ponto na origem (0,0)
	public P0304Ponto2D() {
		x = 0; y = 0;
	}
	
	// construtor parametrizado: ponto na coordenada passada na instanciacao
	public P0304Ponto2D(double px, double py) {
		x = px; y = py;
	}
	
	// determina distancia entre intancia e coordenada dada
	public double distancia(double px, double py) {
		return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
	}
	
	// fornece representacao textual
	public String toString() {
		return "P0304Ponto2D[x=" + x + ", y=" + y + "]";
	}
}
