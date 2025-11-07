package ejercicios3_3Recursividad;

import java.util.Scanner;

public class Ejercicio3 {
	@SuppressWarnings("resource")
	public void exercise3() {
		/*
		 * Realiza una función recursiva que calcule una potencia. Dicha función debe
		 * recibir por parámetro la base y el exponente.
		 */
		Scanner keyboard = new Scanner(System.in);
		int a, b;
		System.out.println("Escribe dos numeros enteros positivos: ");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		pow(a, b);
		System.out.printf("La potencia de %d y de %d es %d", a, b, pow(a, b));
	}

	public int pow(int a, int b) {

		if (a == 0 && b == 0) {
			// Caso base0
		
			return 0;
		} else if (b == 1) {
			return a;
		} else if (b == 0) {
			return 1;
		} else {
			/*
			 * a *: Multiplica por la base actual
			 * 
			 * pow(a, b - 1): Reduce el problema (exponente disminuye en 1)
			 * 
			 * Caso base: Cuando b == 0, retorna 1 y termina la recursión
			 */
			
			return a * pow(a, b - 1);
		}

	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();

	}

}
