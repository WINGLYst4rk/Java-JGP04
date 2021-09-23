package cap02;

//importação dos pacotes
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class P0215SwitchString {

	public static void main(String[] args) {
		
		if (args.length > 0) { // checa se tem algum argumento
			switch(args[0].toLowerCase()) { // transformando os argumetos para caixa baixa
				case "data":
					System.out.println(DateFormat.getDateInstance().
							format(new Date())); // instaciando e mostrando a data atual
					break;
				case "hora":
					System.out.println(DateFormat.getTimeInstance().
							format(new Date())); // instanciando e mostrando a hora atual
					break;
				case "nova-data":
					System.out.println(LocalDate.now().format(DateTimeFormatter.
							ofPattern("dd/MMMM/yyyy"))); // gerando uma nova data atual
					break;
				case "nova-hora":
					System.out.println(LocalTime.now().format(DateTimeFormatter.
							ofPattern("hh:mm:ss"))); // gerando uma nova hora atual
					break;
				default:
					System.out.println("Comando não reconhecido.");
			}
		} else {
			System.out.println("Não foi fornecido nenhum argumento.");
		}
		
	}
	
}
