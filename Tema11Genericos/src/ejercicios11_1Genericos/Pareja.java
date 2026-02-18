package ejercicios11_1Genericos;

public class Pareja<T, V> {
	// Realiza una clase genérica Pareja que contenga dos elementos de cualquier
	// tipo. Realiza los siguientes métodos:

	//Método get para ambos.

	//Método mostrarTipos que muestre el tipo de ambos elementos. Ejemplo: java.lang.String

	//Método mismoTipo que devuelva true si ambos elementos tienen el mismo tipo.

	private T attribute1;
	private V attribute2;

	public Pareja(T attribute1, V attribute2) {
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}

	// Get
	public T getAttribute1() {
		return attribute1;
	}

	public V getAttribute2() {
		return attribute2;
	}

	public void mostrarTipos() {
		System.out.printf("%s y %s\n", attribute1.getClass(), attribute2.getClass());
	}

	public boolean mismoTipo() {
	    return attribute1.getClass().equals(attribute2.getClass());
	}
}
