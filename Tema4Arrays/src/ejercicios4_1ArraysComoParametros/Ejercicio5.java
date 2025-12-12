package ejercicios4_1ArraysComoParametros;

import java.util.Scanner;

public class Ejercicio5 {

	@SuppressWarnings("resource")
	public void exercise5() {
		int[] numbers;
		int data, length;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Escriba cuántos números desea incluir en el array:");
		length = keyboard.nextInt();

		while (length <= 0) {
			System.out.println("Cantidad inválida. Introduzca un número entero positivo:");
			length = keyboard.nextInt();
		}

		numbers = new int[length];

		// Pedir datos al usuario
		for (int i = 0; i < length; i++) {
			System.out.printf("Escriba el valor numérico para el dato %d (0-9):%n", i + 1);
			data = keyboard.nextInt();

			while (data < 0 || data > 9) {
				System.out.println("Valor inválido (debe estar entre 0 y 9). Introduzca nuevamente:");
				data = keyboard.nextInt();
			}

			numbers[i] = data;
		}

		histogramaArray(numbers);
	}

	public void histogramaArray(int... numbers) {

		int[] counter = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			int valor = numbers[i];
			if (valor >= 0 && valor <= 9) {
				counter[valor]++;
			}
		}

		// Buscar la mayor frecuencia
		int maxNumber = 0;
		for (int c = 0; c < numbers.length; c++) {
			if (c > maxNumber) {
				maxNumber = c;
			}
		}

		// Imprimir histograma vertical
		for (int row = maxNumber; row > 0; row--) {
			for (int number = 0; number < counter.length; number++) {
				if (counter[number] >= row) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// Línea inferior con los números 0–9
		for (int number = 0; number < counter.length; number++) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ejercicio5().exercise5();
	}
}
