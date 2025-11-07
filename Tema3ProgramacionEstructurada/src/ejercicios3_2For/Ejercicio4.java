package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio4 {
	public void exercise4() {
		/*
		 * Calcula la suma de los pares y de los impares comprendidos
		 *  entre dos valores enteros n1 y n2 que se introducen por teclado 
		 *  y que cumplan que n1<n2.
		 */
		int number1,number2,number3;
		int par=0,impar=0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escibe un número menor: ");
		number1=keyboard.nextInt();
		System.out.println("Escribe un número mayor: ");
		number2=keyboard.nextInt();
		for(number3=number1;number3<=number2;number3++) {
			if(number3%2==0) {
				par+=number3;//Toma el valor actual de par, luego le suma el number3 y asigna ese valor a par
			}else{
				impar+=number3;
			}
		}
		System.out.printf("La suma de los pares es: %d\n ",par);
		System.out.printf("La suma de los impares es: %d\n ",impar);
		}
	public static void main(String[] args) {
		new Ejercicio4().exercise4();

	}

}
