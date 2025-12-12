package ejercicios4_1ARecorrido;

import java.util.Scanner;

public class Ejercicio2 {
	@SuppressWarnings("resource")
	public void exercise2() {
		boolean b;
		int i;
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30 };
		System.out.println("Introduce true para ver numeros pares y false para ver numeros impares: ");
		b = keyboard.nextBoolean();
		for (i = 0; i < numbers.length; i++) {
			if (b && i % 2 == 0) {
				System.out.printf("Posición %d: %d\n", i, numbers[i]);
			} else if (!b && i % 2 != 0) {
				System.out.printf("Posición %d: %d\n", i, numbers[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
