package ejercicios3_2DoWhile;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio9 {
	@SuppressWarnings("resource")
	public void exercise9() {
		/*
		 * Realiza un procedimiento que obtenga un número elegido aleatoriamente entre 1
		 * y 100 que tenga que adivinar el usuario. Por cada intento del usuario, si no
		 * ha acertado, se le indicará si el número a adivinar es menor o mayor al
		 * elegido. Al final, hay que mostrarle al usuario en cuántos intentos lo ha
		 * adivinado.
		 */
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Adivina el numero aleatorio entre 1 y 100");
		int index = 0, new_number, number;
		number = random.nextInt(100) + 1;
		do {
			System.out.println("Escribe un numero");
			index++;
			new_number = keyboard.nextInt();
			if (new_number != number) {
				System.out.println("Intenta otra vez");
				if (number > new_number) {
					System.out.println("El numero es mayor");
				} else if (number < new_number) {
					System.out.println("El numero es menor");
				}
			}
		} while (new_number != number);
		{
			System.out.println("Has adivinado el numero en " + index + " intentos, el numero aleatorio era " + number);
		}
	}

	public static void main(String[] args) {
		new Ejercicio9().exercise9();
	}

}
