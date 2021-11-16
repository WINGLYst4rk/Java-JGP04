package cap03;

public class P0308CriaRet1 {

	public static void main(String args[]) {
		double larg = Double.parseDouble(args[0]);
		double alt = Double.parseDouble(args[1]);
		
		// cria objeto
		P0307Retangulo retangulo = new P0307Retangulo(larg, alt);
		
		System.out.println("P0307Retangulo[" + retangulo.getLargura() + retangulo.getAltura() + "]");
	}
}
