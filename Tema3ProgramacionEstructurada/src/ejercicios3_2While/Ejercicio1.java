package ejercicios3_2While;

import java.util.Random;

public class Ejercicio1 {
	public void exercise1() {

		int number;
		Random random = new Random();

		while ((number = random.nextInt(1000) + 1) % 9 != 0) {
			System.out.println(number);
		}

	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();

	}

}
//Pongo un numero aleatorio entre 1 y 1000 y que su modulo NO sea 9 (!=) y esa es mi condición
