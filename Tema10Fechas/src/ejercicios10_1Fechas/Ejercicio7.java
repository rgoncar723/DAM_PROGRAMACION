package ejercicios10_1Fechas;

public class Ejercicio7 {
	public void show() {
		// Realiza una clase DateConverter que tenga los siguientes métodos:
		/*
		 * String spanishToAmerican(String): recibe una fecha en formato español
		 * (día/mes/año) y la devuelve en formato americano (mes/día/año).
		 * 
		 * String americanToSpanish(String): recibe una fecha en formato americano
		 * (mes/día/año) y la devuelve en formato español (día/mes/año).
		 * 
		 */
		DateConverter date = new DateConverter();

		System.out.println(date.americanToSpanish("2007-04-28"));
		System.out.println(date.spanishToAmerican("21-08-2007"));
	}

	public static void main(String[] args) {
		new Ejercicio7().show();

	}

}
