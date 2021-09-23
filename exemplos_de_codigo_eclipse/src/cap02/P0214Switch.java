package cap02;

public class P0214Switch {

	public static void main(String[] args) {

		if (args.length > 0) { // checa se tem algun argumento
			switch (args[0].charAt(0)) {
				case 'a': // inicial maiuscula ou mininuscula 
				case 'A':
					System.out.println("Vogal A.");
					break;
				case 'e':
				case 'E':
					System.out.println("Vogal E.");
					break;
				case 'i':
				case 'I':
					System.out.println("Vogal I.");
					break;
				case 'o':
				case 'O':
					System.out.println("Vogal O.");
					break;
				case 'u':
				case 'U':
					System.out.println("Vogal U.");
					break;
				default: // inicial nao e uma vogal
					System.out.println("Não é uma vogal.");
					break;
			}
		} else {
			System.out.println("Não foi fornecido nenhum argumento.");
		}

	}

}
