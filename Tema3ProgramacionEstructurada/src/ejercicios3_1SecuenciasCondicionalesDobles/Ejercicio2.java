package ejercicios3_1SecuenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio2 {
	@SuppressWarnings("resource")
	public void exercise2() {
		/*
		 * Realiza un procedimiento que reciba dos números y muestre si el primero es
		 * múltiplo del segundo. Un número x es múltiplo de y, si al dividir x entre y,
		 * el resto es 0
		 */
		int x, y;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce dos valores enteros: ");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		if (x % y == 0) {
			System.out.printf("Tu numero %d es multiplo de %d\n", x, y);
		} else {
			System.out.printf("Tu numero %d NO es multiplo de %d\n", x, y);
		}

	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
