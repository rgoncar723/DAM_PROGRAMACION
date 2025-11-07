package ejercicios3_1Anidacion;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exercise1() {
		/*
		 * Realiza un procedimiento que reciba un número entero y muestre si el número
		 * es positivo, negativo o cero.
		 */
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Por favor escriba un numero entero: ");
		number = keyboard.nextInt();
		if (number > 0) {
			System.out.println("Tu numero es positivo");
		} else if (number == 0) {
			System.out.println("Tu numero es 0");
		} else {
			System.out.println("Tu numero es negativo");
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();

	}

}
