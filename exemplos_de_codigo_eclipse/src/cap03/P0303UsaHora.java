package cap03;

import java.util.Scanner;

public class P0303UsaHora {

	public static void main(String args[]) {
		// declara e instacia objeto do tipo P0302Hora
		P0302Hora hora = new P0302Hora();

		// ajusta objeto com valores validos
		hora.setHorario(15, 30, 10);

		// exibe a hora
		System.out.println("Hora: " + hora.toString());

		// prepara console
		Scanner sc = new Scanner(System.in);

		// leitura dos valores de hora, minuto e segundo com variaveis auxiliares
		System.out.println("Horas? ");
		int h = sc.nextInt();

		System.out.println("Minutos? ");
		int m = sc.nextInt();

		System.out.println("Segundos? ");
		int s = sc.nextInt();

		// ajusta o objeto com os valores dados
		hora.setHorario(h, m, s);

		// exibe a hora
		System.out.println("Hora: " + hora.toString());
		// checa se a hora esta entra 6 da manha e 18 da tarde
		if (hora.getHoras() >= 18 || hora.getHoras() <= 6) { 
			System.out.println("E noite!");
		} else {
			System.out.println("E dia!");
		}
		sc.close();
	}
}
