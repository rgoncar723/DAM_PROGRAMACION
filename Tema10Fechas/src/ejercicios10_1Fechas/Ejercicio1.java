package ejercicios10_1Fechas;
import java.time.*;


public class Ejercicio1 {
	public void show() {
		// Realiza un método que reciba una fecha y devuelva el día de la semana que
		// corresponde.

		LocalDate currentDate = LocalDate.of(2026,2,14);
		
		System.out.printf("Fecha actual: %s\n",currentDate);
		
		System.out.printf("Dia de la semana correspondiente: %s",getDayWeek(currentDate));
		 
	}
	String getDayWeek(LocalDate currentDate) {
		DayOfWeek day = currentDate.getDayOfWeek();
		return switch(day) {
		case MONDAY -> "LUNES";
		case TUESDAY -> "MARTES";
		case WEDNESDAY -> "MIERCOLES";
		case THURSDAY -> "JUEVES";
		case FRIDAY -> "VIERNES";
		case SATURDAY -> "SABADO";
		case SUNDAY -> "DOMINGO";
		default -> "???";
		};
	
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
