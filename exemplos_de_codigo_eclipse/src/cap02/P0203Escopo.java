package cap02;

public class P0203Escopo {

	public static void main (String args[]) { // inicio bloco 1
		
		int i = 5; // variavel bloco 1
		{ // inicio bloco 2
			int j = 0; // variavel bloc 2
			System.out.println(i); // i dentro d escopo
			
			j = 5 * i; // j dentro do escopo
			System.out.println(j);
			{ // inicio bloco 3
				System.out.println(i);
				System.out.println(j);
			}
		}
		
		System.out.println(i); // i dentro do escopo
//		System.out.println(j); // j fora de escopo
	}
	
	
}
