package cap02;

public class P0219TesteArg {

	public static void main(String[] args) {
		
		if(args.length > 0) { // verifica se tem algum argumento
			int j = Integer.parseInt(args[0]); // converte o 1º argumento para int 
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} else { // avisa que falta um argumento
			System.out.println("Falta um argumento inteiro.");
		}
		
	}
	
}
