package cap03;

@SuppressWarnings("unused")
public class P0310TesteGC {

	public static void main(String args[]) {
		System.out.println("Instancias = " + P0309Objeto.getInstancias());
		for (int i = 0; i < 100; i++) {
			P0309Objeto o = new P0309Objeto();
		}
		System.out.println("Instancias = " + P0309Objeto.getInstancias());
		System.gc(); // aaciona o garbage collector
		System.out.println("Instancias = " + P0309Objeto.getInstancias());
	}
}
