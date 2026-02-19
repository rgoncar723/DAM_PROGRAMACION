package ejercicios10_1Fechas;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {
	public void show() {
		// Realiza un método que reciba dos enteros correspondientes a un mes y un día
		// de este año y devuelva el número de días que han pasado desde el 1 de Enero
		// de este año hasta dicho día.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int day, month;
		System.out.println("Introduzca un día");
		day = keyboard.nextInt();
		System.out.println("Introduzca un mes ");
		month=keyboard.nextInt();
		System.out.printf("Días transcurridos desde el 1 de enero: %d",days(day,month));
	
		
	}

	int days(int day, int month) {
		LocalDate oldDate, currentDate;
		//Bisiesto
		
		//oldDate = LocalDate.of(2024, 1, 1);
		//currentDate = LocalDate.of(2024, month, day);
		
		//No bisiesto
		oldDate = LocalDate.of(Year.now().getValue(), 1, 1);
		currentDate = LocalDate.of(Year.now().getValue(), month, day);
		return (int) ChronoUnit.DAYS.between(oldDate, currentDate);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
