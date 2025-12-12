package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio4 {
	public void exercise4() {
		int[] numbers = { 24, 36, 73, 67 };
		System.out.printf("Array principal: %s", Arrays.toString(numbers));
		System.out.printf("\nArray invertido: %s", Arrays.toString(inversedNumbers(numbers)));
	}

	public int[] inversedNumbers(int... numbers) {
		int[] rest;
		int[] newNumbers;
		int[] result;
		int firstNumber;
		if (numbers.length <= 1) {// Caso base, numeros de elementos par: array vacío, numeros de elementos
									// impar: array 1
			return numbers;
		} else {
			firstNumber = numbers[0];// Marcamos el numero en la posicion inicial

			rest = new int[numbers.length - 1];// Creamos un nuevo array que tenga un indice mas pequeño en comparación
												// con el array numbers.

			System.arraycopy(numbers, 1, rest, 0, rest.length);// Copia el array con base a numbers, desde el
																// indice 1, lo pone en el nuevo array(rest) , desde el incide
																// 0
																// hasta la longitud de rest.

			newNumbers = inversedNumbers(rest);// Funcion recursiva que va a invertir el array, y se guarda el array que
												// hemos copiado(rest).

			result = new int[numbers.length];// Un array para poner los resultados.

			System.arraycopy(newNumbers, 0, result, 0, newNumbers.length);// Copia el array que hemos creado(newNumbers)
																			// anteriormente, desde el indice 0, en un
																			// nuevo array (result), desde el indice 0
																			// hasta la longitud de newNumbers para
																			// incluir todos los numeros.

			result[result.length - 1] = firstNumber;// Coge el ultimo numero del array(result) y lo pone el posición primera del array numbers.

			return result;// Devuelve el array.
		}

	}

	public static void main(String[] args) {
		new Ejercicio4().exercise4();

	}

}
