package ejercicios3_1SecuenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exercise1() {
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce cualquier numero entero: ");
		number = keyboard.nextInt();

		if (number % 2 == 0) {
			System.out.println("Tu numero es par");

		} else {
			System.out.println("Tu numero es impar");
		}

	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();

	}

}
