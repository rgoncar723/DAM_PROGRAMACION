package ejercicios3_2DoWhile;

import java.util.Random;

//Usamos la variable para contar el indice de los intentos.
public class Ejercicio2 {
	public void exercise2() {
		int number;
		int i = 1;
		boolean exit;
		Random random = new Random();

		do {
			number = random.nextInt(1000) + 1;
			exit = (number % 9 == 0);
			System.out.println(number);
			i++;
		} while (!exit && i <= 7);
		if (!exit) {
			System.out.println("No se encontró el múltiplo de 9");
		}
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}

}
