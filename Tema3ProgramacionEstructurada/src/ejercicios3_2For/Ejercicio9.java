package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio9 {
	@SuppressWarnings("resource")
	public void exercise9() {
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Escribe el numero de filas de tu piramide: ");
		number = keyboard.nextInt();
		diamond(number);
	}
	public void diamond(int number) {
		for(int line=1;line<=number;line++) {//pintar n lineas
			for(int spaces=1;spaces<=number-line;spaces++) { // pinta n spacios
				System.out.print(' ');
			}
			for(int blocks=1;blocks<=line;blocks++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int line=number-1;line>=1;line--) {//pintar n lineas
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
		new Ejercicio9().exercise9();

	}

}
