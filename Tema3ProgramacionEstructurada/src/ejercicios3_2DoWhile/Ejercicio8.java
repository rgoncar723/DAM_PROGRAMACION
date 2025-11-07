package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio8 {
	@SuppressWarnings("resource")
	public void exercise8() {
		/*
		 * Realiza un procedimiento que muestre un menú con tres opciones: Sumar dos
		 * números Restar dos números Salir El procedimiento debe ejecutarse hasta que
		 * el usuario elija la opción de salir. En las opciones 1 y 2, los números a
		 * operar se le piden al usuario.
		 */
		Scanner keyboard = new Scanner(System.in);
		int menu, num1, num2;
		int addition, sustraction;
		do {
			System.out.printf("Menu\n");
			System.out.printf(" 1.Sumar dos números \n 2. Restar dos números \n 3. Salir \n Por favor escriba el número para la operación que desea realizar:");
			menu = keyboard.nextInt();
			if (menu == 1) {
				System.out.println("Escriba dos numeros para poder sumarlos entre si: ");
				num1 = keyboard.nextInt();
				num2 = keyboard.nextInt();
				addition = (num1 + num2);
				System.out.printf("La suma de  %d  y de  %d  es  %d\n", num1, num2, addition);
			}
			if (menu == 2) {
				System.out.println("Escriba dos números para poder restrarlos entre si: ");
				num1 = keyboard.nextInt();
				num2 = keyboard.nextInt();
				sustraction = (num1 - num2);
				System.out.printf("La resta de  %d  y de  %d  es  %d\n", num1, num2, sustraction);
			}
		} while (menu != 3);// Cuando el usuario escribe 3, la condición opcion != 3 deja de cumplirse
		System.out.println("Saliendo del programa");
	}

	public static void main(String[] args) {
		new Ejercicio8().exercise8();

	}

}
