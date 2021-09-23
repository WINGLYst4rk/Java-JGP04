package cap02;

import java.util.Calendar;
import java.util.Scanner;

public class P0216SwicthExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero do m�s [1-12]? ");
		int mes = sc.nextInt();

		// switch como express�o
		int ndias = switch (mes) { // switch como express�o
		// n�o precisa da diretiva break
				case 1, 3, 5, 7, 8, 10, 12 -> 31; // usando o operador lambda
				case 4, 6, 9, 11 -> 30;
				default -> 28 + (Calendar.getInstance().get(Calendar.YEAR) % 4 == 0 ? 1 : 0); // operador ternario
		}; // precisa do ponto e virgula
		System.out.printf("M�s #%d tem %d dias.\n", mes, ndias);
		
		sc.close();
	}

}
