package ejercicios3_1SentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exercise1() {
		/*
		 * Realiza un procedimiento que reciba una nota y muestre lo siguiente: (hacerlo
		 * con anidación y con switch)
		 */
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Por favor escriba su calificacion de Programación: ");
		number = keyboard.nextInt();
		// Anidacion
		if (number >= 9) {
			System.out.println("Su calificación es: Sobresaliente!");
		} else if (number >= 7 && number <= 8) {
			System.out.println("Su calificación es: Notable");

		} else if (number == 6) {
			System.out.println("Su calificación Bien");
		} else if (number == 5) {
			System.out.println("Su calificación es Suficiente");
		} else if (number >= 3 && number <= 4) {
			System.out.println("Su calificación es Insuficiente");
		} else {
			System.out.println("Su calificación es Muy deficiente");
		}
		System.out.println("Switch:");
		// Switch
		switch (number) {
		case 0:
		case 1:
		case 2:
			System.out.println("Su calificación es Muy Deficiente");
			break;
		case 3:
		case 4:
			System.out.println("Su calificación es muy Insuficiente");
			break;
		case 5:
			System.out.println("Su calificación es muy suficiente");
			break;
		case 6:
			System.out.println("Su calificación es Bien");
			break;
		case 7:
		case 8:
			System.out.println("Su calificación es Notable");
			break;
		case 9:
		case 10:
			System.out.println("Su calificación es Sobresaliente");
			break;
		default:
			System.out.println("Nota invalida");
			break;
		}

	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();

	}

}
