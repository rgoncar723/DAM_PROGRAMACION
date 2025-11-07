package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio3 {
	@SuppressWarnings("resource")
	public void exercise3() {
		// Pídele al usuario que introduzca notas entre 0 y 10 hasta que introduzca una
		// nota no válida.
		int number;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Escriba un numero entre 0 y 10");
			number = keyboard.nextInt();
			if (number >= 0 && number <= 10) {
				System.out.printf("El número introducido en es %d\n", number);
			}
		} while (number < 0 || number > 10);
		{

		}

	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();
	}

}
