package cap03;
/*
 * Essa classe e mais utilizada por estar encapsulada ja que seus
 * atributos estao encapsulados e assim permite mais seguranca para 
 * o objeto e para o programa
 */

public class P0302Hora {

	private int hor, min, seg; // atributos privados para encapsulamento

	public int getHoras() { // metodo para exibir a hora
		return hor;
	}

	public int getMinutos() { // metodo para exibir o mminuto
		return min;
	}

	public int getSegundos() { // metodo para exibir os segundos
		return seg;
	}

	public void setHoras(int h) { // metodo para configurar a hora
		if (h >= 0 && h < 24)
			hor = h;
	}

	public void setMinutos(int m) { // metodo para configurar os minutos
		if (m >= 0 && m < 60)
			min = m;
	}

	public void setSegundos(int s) { // metodo para configurar os segundos
		if (s >= 0 && s < 60)
			seg = s;
	}

	public void setHorario(int h, int m, int s) { // metodo para configurar horario
		setHoras(h);
		setMinutos(m);
		setSegundos(s);
	}

	@Override
	public String toString() { // sobrescrita do metodo to srting com um formato
		return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
	}
}
