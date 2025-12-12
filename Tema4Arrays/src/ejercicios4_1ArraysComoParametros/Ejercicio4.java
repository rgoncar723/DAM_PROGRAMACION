package ejercicios4_1ArraysComoParametros;

import java.util.Scanner;

public class Ejercicio4 {
	@SuppressWarnings("resource")
	public void exercise4() {
		int[] numbers;
		int data, length, number;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escriba cuantos numeros desea incluir en el array: ");
		length = keyboard.nextInt();
		numbers = new int[length];
		for (int i = 0; i < length; i++) {// Pedirle los datos al usuario
			System.out.printf("Escriba el valor numerico para el dato %d\n", i + 1);
			data = keyboard.nextInt();
			numbers[i] = data;// Importante poner el numbers[i] y despues el value, porque value puede ser 0
		}
		System.out.println("Escriba el numero que desea introducir para buscarlo en el array: ");
		number = keyboard.nextInt();

		System.out.printf("El número %d se encuentra %d veces en el array.", number, posiciones(number, numbers));

	}

	public int posiciones(int number, int... numbers) {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		new Ejercicio4().exercise4();
	}

}
