package ejercicios10_1Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
	String spanishToAmerican(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate newDate = LocalDate.parse(date,formatter);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return newDate.format(formatter2);
	}
	String americanToSpanish(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate newDate = LocalDate.parse(date,formatter);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return newDate.format(formatter2);
	}
}
