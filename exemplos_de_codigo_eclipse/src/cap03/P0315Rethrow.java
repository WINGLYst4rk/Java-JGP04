package cap03;

public class P0315Rethrow {

	@SuppressWarnings("deprecation")
	public static Object create(String classname) throws ClassNotFoundException, IllegalAccessException {
		try {
			Class<?> classe = Class.forName(classname);
			return classe.newInstance();
		} catch (ClassNotFoundException e) {
			throw e; // rethrow
		} catch (InstantiationException e) {
			// tratamento local
			System.out.println(e + "\nObjeto nao criado");
			return null;
		} catch (IllegalAccessException e) {
			throw e; // rethrow
		}

	}

	public static void main(String... a) { // usando ellipsis
		try {
			Object o = create(a[0]); // pegando o 1º argumento de a usando ellipsis
			if (o != null) {
				System.out.println("Objeto: " + o.getClass());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "\nFalta argumento com nome da classe!");
		// multi-catch	
		} catch (ClassNotFoundException | IllegalAccessException e) {
			System.out.println(e);
		}
	}
}
