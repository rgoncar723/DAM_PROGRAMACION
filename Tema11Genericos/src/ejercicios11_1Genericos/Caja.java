package ejercicios11_1Genericos;

public class Caja<T> {
	// Realiza una clase genérica Caja que pueda guardar un objeto de cualquier
	// tipo. Realiza para dicha clase los métodos get y set.

	private T attribute; // Declaramos un atributo tipo Generic

	public Caja(T attribute) {
		this.attribute = attribute;
	}

	public T getAttribute() {
		return attribute;
	}

	public void setAttribute(T attribute) {
		this.attribute = attribute;
	}

	public void show() {
		System.out.printf("El tipo de Generic es %s", attribute.getClass().getSimpleName());
		System.out.printf(" -----> Valor del atributo: %s\n", getAttribute());
	}
}
