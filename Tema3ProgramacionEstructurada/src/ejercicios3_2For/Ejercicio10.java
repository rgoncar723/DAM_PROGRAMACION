package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio10 {
	@SuppressWarnings("resource")
	public void exercise10() {
		/*
		 * Realiza un procedimiento que reciba un número entero positivo n y dibuje un
		 * triángulo donde en la fila enésima aparezcan n valores.
		 */
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduza un numero");
		number = keyboard.nextInt();
		pyramid(number);
	}

	public void pyramid(int number) {

		for (int line = 1; line <= number; line++) {// pintar n lineas
			for (int spaces = 1; spaces <= number - line; spaces++) { // pinta n spacios
				System.out.print(' ');
			}
			for (int blocks = 1; blocks <= line; blocks++) {// Pinta desde 1 hasta el número de fila

				System.out.printf("%d ", blocks);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Ejercicio10().exercise10();

	}

}
