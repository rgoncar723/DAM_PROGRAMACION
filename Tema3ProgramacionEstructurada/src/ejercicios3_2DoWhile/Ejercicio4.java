package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio4 {
	@SuppressWarnings("resource")
	public void exercise4() {
		// En el ejercicio anterior, ve mostrando al usuario la nota que ha introducido
		// en cada iteración
		int number;
		int index = 1;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Escriba un numero entre 0 y 10");
			number = keyboard.nextInt();
			if (number >= 0 && number <= 10) {
				System.out.printf("El número introducido en la iteración %d es %d\n", index, number);
				index++;
			} else {
				System.out.println("Nota invalida");
			}
		} while (number >= 0 && number <= 10);
		{

		}

	}

	public static void main(String[] args) {
		new Ejercicio4().exercise4();

	}
}
//Hay que poner el if else para que siga preguntando 
