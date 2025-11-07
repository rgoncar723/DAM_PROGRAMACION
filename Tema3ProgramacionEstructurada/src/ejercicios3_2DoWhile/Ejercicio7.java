package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio7 {
	@SuppressWarnings("resource")
	public void exercise7() {
		// PIN correcto que el sistema tiene guardado
		int PIN = 1234, NEW_PIN;
		int index = 3;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.printf("Escriba su PIN\n");
			NEW_PIN = keyboard.nextInt();
			if (PIN != NEW_PIN) {
				index--;
				if (index > 0) {
					System.out.printf("PIN Incorrecto, tiene %d intentos restantes\n", index);
				} else {
					System.out.println("Acceso denegado");
				}
			} else {
				System.out.println("Ha verificado su PIN");
			}

		} while (NEW_PIN != PIN && index > 0); // el bucle se repite mientras el PIN sea incorrecto y queden intentos
	}

	public static void main(String[] args) {
		new Ejercicio7().exercise7();
	}

}
