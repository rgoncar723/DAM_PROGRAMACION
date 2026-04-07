package ejercicios12_1ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public void show() {
		/**
		 * Crea un programa que:
		 * 
		 * Lea 10 números enteros introducidos por el usuario y los almacene en un
		 * ArrayList.
		 * 
		 * Calcule la media.
		 * 
		 * Muestre los números inferiores a la media.
		 */
		ArrayList<Integer> numbers = new ArrayList<>(10);
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		int value;
		double avarege;
		System.out.println("Introduzca 10 numeros enteros");

		for (int i = 0; i < 10; i++) {
			System.out.printf("Valor para el número %d\n", i + 1);
			value = kb.nextInt();
			numbers.add(i, value);
		}
		avarege = getAvarege(numbers);
		System.out.println("La media es de " + avarege);
		System.out.println("Los números inferiores a la media son " + getNumbersBelowAverage(numbers, avarege));

	}

	public double getAvarege(ArrayList<Integer> numbers) {
		double avarege = 0.0;
		double sum = 0.0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
			
		}
		avarege = sum / numbers.size();
		return numbers.isEmpty() ? 0 : avarege;
	}

	public String getNumbersBelowAverage(ArrayList<Integer> numbers, double avarege) {
		ArrayList<Integer> filteredList = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < avarege) {
				filteredList.add(numbers.get(i));
			}
		}
		return filteredList.toString();
	}

	public static void main(String[] args) {
		new Main1().show();
	}

}
