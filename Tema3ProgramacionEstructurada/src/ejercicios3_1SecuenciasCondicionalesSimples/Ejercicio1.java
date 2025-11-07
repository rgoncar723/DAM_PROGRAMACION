package ejercicios3_1SecuenciasCondicionalesSimples;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exercise1() {
		Scanner keyboard = new Scanner(System.in);
		double number, number2;
		System.out.print("Introduce un numero con cifras decimales: ");
		number = keyboard.nextFloat();
		if (number >= 1000) {
			number2 = (number * 15.0 / 100.0);
			System.out.printf("El 15 por ciento es %f\n  ", number2);
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();

	}

}
