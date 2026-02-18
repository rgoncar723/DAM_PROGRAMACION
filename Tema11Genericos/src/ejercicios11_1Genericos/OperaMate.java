package ejercicios11_1Genericos;

public class OperaMate<T extends Number> {
	// Realiza una clase genérica OperaMate que tenga un elemento de cualquier tipo
	// numérico. Realiza los siguientes métodos:

	//Método recíproco para obtener el recíproco del número (se obtiene dividiendo 1 entre el número).

	//Método fracción para obtener la parte fraccionaria.

	private T attribute5;

	public OperaMate(T attribute5) {
		this.attribute5 = attribute5;
	}

	public double reciproco() {
		return 1.0 / attribute5.doubleValue();
	}

	public double fraccion() {
		double valor = attribute5.doubleValue();
		return valor - attribute5.intValue();
	}
}
