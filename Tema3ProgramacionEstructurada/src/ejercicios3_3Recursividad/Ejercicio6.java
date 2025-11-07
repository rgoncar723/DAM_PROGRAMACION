package ejercicios3_3Recursividad;

import java.util.Scanner;

public class Ejercicio6 {
	@SuppressWarnings("resource")
	public void exercise6() {
		/*
		 * En matemáticas, la sucesión o serie de Fibonacci es la siguiente sucesión
		 * infinita de números naturales:
		 * 
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …..
		 * 
		 * La serie comienza con los números 0 y 1 y a partir de éstos, cada término es
		 * la suma de los dos anteriores.
		 * 
		 * Realiza una función recursiva que devuelva el elemento enésimo de la serie de
		 * Fibonacci. Es decir, si recibe:
		 * 
		 * 0: devuelve 0
		 * 
		 * 1: devuelve 1
		 * 
		 * 4: devuelve 3
		 * 
		 * 7: devuelve 13
		 */
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Escriba un numero entero positivo");
		number = keyboard.nextInt();
		Fibonnaci(number);
		System.out.printf(Fibonnaci(number) + " \n");
		System.out.printf("El numero en la %d sucesión fibonacci es: %d\n ", number, Fibonnaci(number));
		System.out.println("Suceccion:");

		for (int i = 0; i <= number; i++) {
			System.out.print(Fibonnaci(i) + " ");
		}
	}

	public int Fibonnaci(int number) {
		// Casos base
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		return Fibonnaci(number - 1) + Fibonnaci(number - 2);

	}

	public static void main(String[] args) {
		new Ejercicio6().exercise6();
	}

}
