package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio6 {
	@SuppressWarnings("resource")
	public void exercise6() {
		/*
		 * En el ejercicio anterior, muestra la nota media de los aprobados y la nota
		 * media de los suspensos. ¿cómo se llaman las variables que has utilizado para
		 * las notas medias?
		 */
		int number;
		int index = 1, counter_aprobados = 0, counter_suspensos = 0;
		double suma_aprobados = 0.0, suma_suspensos = 0.0;
		double media_aprobados = 0.0, media_suspensos = 0.0;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.printf("Escriba un numero entre 0 y 10\n");
			number = keyboard.nextInt();
			if (number >= 0 && number <= 10) {
				System.out.printf("El número introducido en la iteración %d es %d\n", index, number);
				index++;
				if (number >= 5) {
					counter_aprobados++;
					suma_aprobados += number;
					System.out.printf("Aprobado\n");

				} else {
					counter_suspensos++;
					suma_suspensos += number;
					System.out.printf("Suspendido\n");
				}
			}

			else {
				System.out.println("Nota invalida");
			}
		} while (number >= 0 && number <= 10);
		if (counter_aprobados > 0) {
			media_aprobados = (suma_aprobados / counter_aprobados);
		}
		if (counter_suspensos > 0) {
			media_suspensos = (suma_suspensos / counter_suspensos);
		}
		System.out.printf("En %d interaciones se han introducido %d numeros \n", index - 1, (index - 1));
		System.out.printf("De los cuales: %d eran aprobados y %d eran suspensos \n", counter_aprobados,
				counter_suspensos);
		System.out.printf("Media de aprobados: %.2f%n\n", media_aprobados);
		System.out.printf("Media de suspensos: %.2f%n\n", media_suspensos);
	}

	public static void main(String[] args) {
		new Ejercicio6().exercise6();

	}

}
//suma_aprobados y suma_suspensos acumulan todas las notas.
//La media se calcula después del bucle
//index - 1 porque el contador aumenta antes de salir del bucle.