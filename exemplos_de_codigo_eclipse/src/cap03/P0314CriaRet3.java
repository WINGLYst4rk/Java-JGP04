package cap03;
/*
 * aqui temos um tratamento de erros mais especifico
 * que trata os erros como falta de argumentos, falha na conversao
 * e deixa os erros menos especificos e que nao seria facil de tratar
 * para o contexto das Exception tratar. Um contexto superior de 
 * excecoes monitoradas
 */
public class P0314CriaRet3 {

	public static void main(String args[]) {

		try {
			// variaveis auxiliares recebem conversao dos argumentos
			double larg = Double.parseDouble(args[0]); // 1º argumento
			double alt = Double.parseDouble(args[1]); // 2º argumento

			// cria objeto
			P0312Retangulo retangulo = new P0312Retangulo(larg, alt);

			// uso implicito de retangulo3.toString() exibe info do objeto
			System.out.println(retangulo);
		} catch (ArrayIndexOutOfBoundsException exc) {
			// trata a falta de argumentos
			System.out.println("numero insuficiente de argumentos.");
		} catch (NumberFormatException exc) {
			// trata erros de conversao
			System.out.println("Argumento(s) invalido(s)");
		} catch (Exception exc) {
			// trata erros de instanciacao do retangulo
			System.out.println("Dimensoes invalidas.");
		}
	}
}
