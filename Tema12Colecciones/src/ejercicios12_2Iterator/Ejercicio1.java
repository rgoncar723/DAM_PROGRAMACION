package ejercicios12_2Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
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
		 * 
		 * Modifica el ejercicio 1 del boletín Ejercicios 12 ArrayList para que además
		 * de mostrar los números inferiores a la media, los elimine del ArrayList.
		 * 
		 */
		ArrayList<Integer> numbers = new ArrayList<>(10);
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> removed;
		int value;
		double average;
		System.out.println("Introduzca 10 numeros enteros");

		for (int i = 0; i < 10; i++) {
			System.out.printf("Valor para el número %d\n", i + 1);
			value = kb.nextInt();
			numbers.add(i, value);
		}
		average = getAvarege(numbers);
		System.out.println("La media es de " + average);
		System.out.println("Los números inferiores a la media son " + getNumbersBelowAverage(numbers, average));
		removed = removeBelowAverage(numbers, average);

		System.out.println("Números eliminados (inferiores a la media): " + removed);
		System.out.println("Lista resultante: " + numbers);

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

	public ArrayList<Integer> removeBelowAverage(ArrayList<Integer> numbers, double average) {
		ArrayList<Integer> removedElements = new ArrayList<>();
		Iterator<Integer> it = numbers.iterator(); // It creates the Iterator object.
		Integer current;
		while (it.hasNext()) {
			 current = it.next(); // 1. It jumps over the next element.
										// 2.It returns that element so we can store
										// it in the variable current.
			if (current < average) {
				removedElements.add(current); // Keep track of what we remove
				it.remove(); // This safely removes from 'numbers'
			}
		}
		return removedElements;
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
