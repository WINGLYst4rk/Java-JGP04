package cap03;
/*
 * Essa classe mostra como nao encapsular pois
 * todos os atributos estao expostos criando brecha para
 * facil alteracao
 */
public class P0301Hora {

	public int hor, min, seg; // atributos do tipo int
	public void setHorario(int h, int m, int s) { // metodo para criar o horario
		hor = h;
		min = m;
		seg = s;
		
	}
	@Override
	public String toString() {
		return hor + ":" + min + ":" + seg;
	}
}
