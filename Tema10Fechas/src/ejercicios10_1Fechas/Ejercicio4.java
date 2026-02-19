package ejercicios10_1Fechas;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio4 {
	public void show() {
		// Realiza un método que reciba un año y devuelva si es bisiesto o no. No se
		// puede usar el método isLeap().
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		int age = 0;
		Year.of(age);
		System.out.println("Por favor ingrese un año para comprobar si es bisiesto o no");
		age = kb.nextInt();
		System.out.printf("El año %d %s es bisiesto", age, isLeap(age) ? "Sí" : "No");
	}

	public boolean isLeap(int age) {
		boolean isLeap = false;
		if ((age % 4 == 0 && age % 100 != 0) || (age % 400 == 0)) {
			return !isLeap;
		} else {
			return isLeap;
		}

	}

	public static void main(String[] args) {
		new Ejercicio4().show();

	}

}
