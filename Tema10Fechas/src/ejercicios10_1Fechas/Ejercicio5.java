package ejercicios10_1Fechas;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio5 {
	public void show() {
		//Realiza un método que reciba una fecha de nacimiento y devuelva la edad.
	@SuppressWarnings("resource")
	Scanner kb = new Scanner(System.in);
	int birthYear;
	System.out.println("Introduzca su año de nacimiento");
	birthYear = kb.nextInt();
	System.out.printf("Tienes %d años. Si no los has cumplido, pues son los años que vas a tener",	getYourAge(birthYear));
	}
	public int getYourAge(int birthYear) {
		Year year = Year.of(2026);
		int age = year.getValue()-birthYear;
		return age;
	}
	

	public static void main(String[] args) {
		new Ejercicio5().show();

	}

}
