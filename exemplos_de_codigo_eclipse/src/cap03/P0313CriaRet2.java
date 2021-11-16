package cap03;

/*
 * Essa classe usa a retangulo 11 onde se tem uma excecao nao monitorada
 * entao com o uso do try catch podemos monitorar qualquer erro nessa classe 
 * qunato no objeto criado pela classe 11
 * tambem temos um tratamento generico com esse try catch
 */
public class P0313CriaRet2 {

	public static void main(String[] arg) {

		try {
			// variaveis locais recebem conversao dos argumentos
			double larg = Double.parseDouble(arg[0]);
			double alt = Double.parseDouble(arg[1]);

			P0311Retangulo retangulo = new P0311Retangulo(larg, alt);
			// uso implicito de retangulo2.toString() exibe info do objeto
			System.out.println(retangulo);

		} catch (Exception exc) {
			// exibe erros ocorridos durante a execucao
			System.out.println("Erro durante a execucao:\n" + exc);
		}
	}
}
