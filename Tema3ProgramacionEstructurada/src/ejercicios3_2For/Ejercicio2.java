package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio2 {
	@SuppressWarnings("resource")
	public void exercise2() {
		/*
		 * Pídele al usuario un número entre 0 y 10 y muestra la tabla de multiplicar de dicho número.
		 *  Muestra el resultado por consola alineado de la siguiente manera:
		 */
	
		int number,result;
		int j;// j tomará valores: 1, 2, 3, ..., 10
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce un número de 0 a 10:");
		number= keyboard.nextInt();
		for (j=0;j<=10;j++) {
			result= (number*j);
			System.out.printf("%d X %d = %d\n",number,j,result);
		}
	}
	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}

}
