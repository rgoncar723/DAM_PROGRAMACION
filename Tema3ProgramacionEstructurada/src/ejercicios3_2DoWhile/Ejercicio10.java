package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio10 {
	@SuppressWarnings("resource")
	public void exercise10() {
		/*
		 * Realiza un procedimiento que pida un número entero y sume todos sus dígitos.
		 * Por ejemplo, si se introduce 1234, el resultado es 10, ya que 10 = 1+2+3+4.
		 * No se puede usar una cadena para obtener los dígitos, sino que se tienen que
		 * obtener con operaciones matemáticas. (Esto es masoquismo puro y duro, en su
		 * maximo esplendor)
		 */
		Scanner keyboard = new Scanner(System.in);
		int number;
		int sum = 0, digit;
		System.out.println("Escriba un numero entero");
		number = keyboard.nextInt();
		do {
			// Obtiene el último dígito usando módulo 10
			digit = number % 10;
			// Suma el dígito al total
			sum += digit;
			// Elimina el último dígito usando división entera entre 10
			number = (number / 10);
		} while (number > 0);
		System.out.printf("Suma de los digitos del numero %d, la suma es %d", number, sum);
	}

	public static void main(String[] args) {
		new Ejercicio10().exercise10();

	}

}
