package cap02;

public class P0223TryCatchFinally {

	public static void main(String[] args) {
		
		int j = 5; // valor default
		
		try {
			j = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("Argumento invalido ou ausente. Usando Default");
		} finally {
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		}
	}
}
