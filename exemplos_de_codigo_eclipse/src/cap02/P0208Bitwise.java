package cap02;

public class P0208Bitwise {

	public static void main(String[] args) {

		byte a = 0x1f, b = 0x10; // inicia e declara variaveis

		System.out.println("Valores a = " + a + ", b = " + b);
		// operações bitwise
		System.out.println(" a & b = " + (a & b)); // E
		System.out.println(" a | b = " + (a | b)); // OU
		System.out.println(" a ^ b = " + (a ^ b)); // OU exclusivo / XOR
		System.out.println(" ~ b = " + ((~b))); // Complemento de 2
		System.out.println(" a << 2 = " + (a << 2)); // Rotação a esquerda de n bits
		System.out.println(" -a >> 4 = " + (-a >> 4)); // Rotação a direita de n bits
		System.out.println(" -a >>> 4 = " + (-a >>> 4)); // Rotação a direita sem sinal

	}

}
