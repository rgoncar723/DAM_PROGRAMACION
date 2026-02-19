package ejercicios10_1Fechas;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio6 {
	public void show() {
		/*
		 * Realiza un método que muestre el momento actual de la siguiente manera:  
		 * Hoy es sábado 12-marzo-2011 a las 10:22:13
		 */
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(dayAndHour(currentDate));
	}
	public String dayAndHour(LocalDateTime currentTime) {
		DateTimeFormatter textAndPatternMix = DateTimeFormatter
				.ofPattern("'Hoy es' EEEE dd-MMMM-yyyy 'a las' HH:mm:ss");
		return String.format("%s", currentTime.format(textAndPatternMix));

	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}

}
