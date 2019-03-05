package operaciones;

public class Principal {
	public static void main(String[] args) {
		Operacions fact = new Operacions();
		try {
			double valor = fact.getIterativa(-3);
			System.out.println(valor);
		} catch (IllegalArgumentException e) {
			System.out.println("No es poden fer servir nombres negatius.");
		}
	}
}