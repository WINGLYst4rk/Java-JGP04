package cap02;

import java.util.Arrays;
import java.util.Scanner;

public class P0230UsoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // prepara console

		System.out.print("N� de elementos ? "); // l� n� de elementos
		int tamanho = sc.nextInt();

		System.out.print("Preenchimento real? "); // l� preenchimento

		double valor = sc.nextDouble();
		double arranjo1[] = new double[tamanho]; // aloca arranjo
		Arrays.fill(arranjo1, valor); // preenche arranjo
		System.out.println(Arrays.toString(arranjo1)); // exibe arranjo

		// l� possi��es inicial e final da c�pia
		System.out.print("Possi��o inicial da copia? ");
		int de = sc.nextInt();
		System.out.print("Possi��o final da copia? ");
		int para = sc.nextInt();

		// efetua c�pia parcial e integral
		double arranjo2[] = Arrays.copyOfRange(arranjo1, de, para);
		double arranjo3[] = Arrays.copyOf(arranjo1, arranjo1.length);

		// exibe novos arrays
		System.out.println("Copia parcial:\n" + Arrays.toString(arranjo2));
		System.out.println("Copia total:\n" + Arrays.toString(arranjo3));

		sc.close(); // fecha console
	}

}
