package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio8 {
	@SuppressWarnings("resource")
	public void exercise8() {
		/*
		 * Realiza un procedimiento que reciba un número entero positivo n y dibuje un triángulo de asteriscos. 
		 * El triángulo debe contener un asterisco en la primera línea, dos en la segunda, etc.; 
		 * es decir, en la fila enésima deben aparecer n asteriscos. Ejemplo para n=5:
		 */
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Escribe el numero de filas de tu piramide: ");
		number = keyboard.nextInt();
		pyramid(number);
	}
	public void pyramid(int number) {
	
		for(int line=1;line<=number;line++) {//pintar n lineas
			for(int spaces=1;spaces<=number-line;spaces++) { // pinta n spacios
				System.out.print(' ');
			}
			for(int blocks=1;blocks<=line;blocks++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Ejercicio8().exercise8();

	}
//Quieres una escalera quitale el number- a lo spaces, y lito!
}
