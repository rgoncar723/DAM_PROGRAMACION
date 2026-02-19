package ejercicios10_1Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Ejercicio3 {

	public void show() {
		// Realiza un método que reciba una cadena con una fecha y devuelva si dicha
		// fecha es correcta.
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		String date;
		System.out.println("Introduzca una fecha");
		date = kb.nextLine();
		System.out.printf("%s %s es una fecha correcta", date, dateToFormat(date) ? "Sí" : "No");
	}

	boolean dateToFormat(String date) {
		LocalDate newDate;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy").withResolverStyle(ResolverStyle.STRICT);// activa
																														// validación
																														// estricta
		try {
			newDate = LocalDate.parse(date, format);
			return true;
		} catch (DateTimeParseException e) { // Si el día/mes/año no existe lanza la excepción.
			return false;

		}
	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
