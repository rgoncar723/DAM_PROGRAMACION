package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio11 {
	@SuppressWarnings("resource")
	public void exercise11() {
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Escribe el numero de filas de tu piramide: ");
		number = keyboard.nextInt();
		pyramid(number);
	}
	public void pyramid(int number) {
		for(int line=1;line<=number;line++) {//pinta n lineas
			
			for(int spaces=1;spaces<=number-line;spaces++) {
				System.out.print("  ");
			}
			for(int blocks=1;blocks<=line;blocks++) {
				System.out.print(blocks+" ");
			}
			for (int num=line-1;num>=1;num--) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Ejercicio11().exercise11();

	}

}
