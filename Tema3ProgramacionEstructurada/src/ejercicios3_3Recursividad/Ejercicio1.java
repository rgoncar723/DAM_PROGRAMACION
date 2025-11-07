package ejercicios3_3Recursividad;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exercise1() {
		/*
		 * El máximo común divisor de los enteros a y b es el entero más grande que es
		 * divisor exacto de a y de b. Por ejemplo, 12 es el mcd de 36 y 60.
		 * 
		 * Realiza una función recursiva llamada mcd que devuelva el máximo común
		 * divisor de a y b según el algoritmo de Euclides:
		 * 
		 * si b = 0 → mcd(a, b) = a.
		 * 
		 * si b ǂ 0 → mcd(a, b) = mcd(b, a%b).
		 */
		
		Scanner keyboard = new Scanner(System.in);
		int a, b;
		System.out.println("Escribe dos numeros enteros positivos: ");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		mcd(b,a);
		System.out.printf("El maximo comun divisor de %d y de %d es %d",a,b,mcd(b,a));

	}
	public int mcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return mcd(b,a%b);
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}

}
