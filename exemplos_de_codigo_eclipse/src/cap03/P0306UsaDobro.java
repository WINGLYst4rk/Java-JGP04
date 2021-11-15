package cap03;

public class P0306UsaDobro {

	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		// uso de metodo estatico da classe dobro sem instancia
		System.out.println("Numero de instancias de Dobro = " + P0305Dobro.getInstancias());
		
		// declara e inicializa variave inteira com valor arbitrario
		int x = 7;
		
		// instanciacao
		System.out.println("Instanciando objeto Dobro");
		P0305Dobro d = new P0305Dobro();
		
		// uso de metodos estaticos e nao estaticos da classe Dobro
		System.out.println("numero de instancias de Dobro = " + d.getInstancias());
		System.out.println("O dobro de " + x + " = " + d.dobro(x));
		System.out.println("Ultimo valor usado: " + d.ultimoValor);
	}
}
