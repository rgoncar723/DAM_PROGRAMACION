package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio5 {
	@SuppressWarnings("resource")
	public void exercise5() {
		/*
		 * Utilizando un bucle for con dos variables, 
		 * realiza un programa que dados dos números enteros positivos n1 y n2 
		 * que se introducen por teclado y que cumplan que n1<n2, 
		 * vaya aumentando n1 al doble de su valor y disminuyendo n2 a la mitad de su valor hasta que n1>n2.
		 */
		int number1,number2,n3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escibe un número: ");
		number1=keyboard.nextInt();
		System.out.println("Escribe otro número: ");
		number2=keyboard.nextInt();
		for(n3=number1;n3<=number2;) {
			if(n3>number2) {
				System.out.println("Escribe otra vez lo numeros asegurate de que el primero sea menor que el segundo.");
			}
			else {
				n3=(n3*2);
				number2=(number2/2);
				System.out.printf("Number1:%d\tNumber2:%d\n",n3,number2);
			}
		}
		System.out.printf("Number1:%d\tNumber2:%d\n",n3,number2);
		
	}

	public static void main(String[] args) {
		new Ejercicio5().exercise5();
	}

}
