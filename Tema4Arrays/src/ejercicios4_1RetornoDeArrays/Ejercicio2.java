package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio2 {
	public void exercise2() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.printf("Arrays de numeros %s", Arrays.toString(numbers));
		invertedNumbers(numbers);
		System.out.printf("\nArray invertido %s", Arrays.toString(invertedNumbers(numbers)));
	}

	public int[] invertedNumbers(int... numbers) {
		int[] newNumbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[numbers.length - 1 - i];
		}
		return newNumbers;
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}

}
