package ejercicios4_1ArraysComoParametros;

import java.util.Arrays;


public class Ejercicio6 {

	public void exercise6() {
		int[] numbers= {9,0,0,9};
		int[] number2= {1,2,3,4};
		boolean capicua = false;
		capicua = capicuas(numbers);
		if (capicua) {
			System.out.println("Es verdad");
		} else {
			System.out.println("No lo es");
		}
		capicua=capicuas(number2);
		if (capicua) {
			System.out.println("Es verdad");
		} else {
			System.out.println("No lo es");
		}
	}

	public boolean capicuas(int... numbers) {

		if (numbers.length <= 1) {
			return true;
		} else if (numbers[0] != numbers[numbers.length - 1]) {
			return false;
		} else {
			return capicuas(Arrays.copyOfRange(numbers,1, numbers.length - 1));
		}

	}

	public static void main(String[] args) {
		new Ejercicio6().exercise6();

	}

}
