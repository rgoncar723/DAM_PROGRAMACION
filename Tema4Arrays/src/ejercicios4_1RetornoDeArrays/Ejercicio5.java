package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	@SuppressWarnings("resource")
	public void exercise5() {
		Scanner keyboard = new Scanner(System.in);
		double newNumber;
		double[] numbers = { 1.9, 2.9, 3.4, 5.0, 4.3, 7.8, 10.6, 18.8, 8.2, 4.6, 12.6, 9.4, 10.7, 15.2 };
		int start, end;
		Arrays.sort(numbers);
		System.out.println("Introduzca un numero decimal para buscarlo:");
		newNumber = keyboard.nextDouble();
		start=0;
		end=numbers.length;
		int index = searchNumber(start, end, newNumber, numbers);
		if (index >= 0) {
			System.out.printf("El numero %.1f se encuentra en la posicion %d del array ", newNumber, index);
		} else {
			System.out.println("El numero no se encuentra en el array");
		}

	}

	public int searchNumber(int start, int end, double newNumber, double... numbers) {
		
		if (start > end) {
			return -1;
		}
		int half = (start + end) / 2;
		if (numbers[half] == newNumber) {
			return half;
		} else if (newNumber > numbers[half]) {
			return searchNumber(half+1, end, newNumber, numbers);
		} else {
			return searchNumber(start, half-1, newNumber, numbers);
		}

	}

	public static void main(String[] args) {
		new Ejercicio5().exercise5();
	}

}
