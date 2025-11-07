package ejercicios3_2DoWhile;

import java.util.Random;

public class Ejercicio1 {
	public void exercise1() {

		/*
		 * Modifica el Ejercicio 1 del boletín Ejercicios 3.2 While para que en cuanto
		 * salga el primer múltiplo de 9, éste sí se muestre y el procedimiento
		 * finalice.
		 */
		// i es indice
		int number;
		boolean exit;
		Random random = new Random();
		do {
			number = random.nextInt(1000) + 1;
			exit = (number % 9 == 0);
			System.out.println(number);
		} while (!exit);

	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}

}
//Aparecen numeros que no son mulitplo de 9 hasta que aparezca un numero que si lo sea. 
