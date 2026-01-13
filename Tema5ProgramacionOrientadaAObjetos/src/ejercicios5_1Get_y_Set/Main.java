package ejercicios5_1Get_y_Set;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public void show() {
		// Declaracion de variables
		String newName;
		Person person = new Person();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Hola %s! bienvenid@\n", person.getName());//Muestra el nombre por consola

		System.out.println("Por favor introduzca su nuevo nombre:");

		newName = keyboard.nextLine();

		person.setName(newName);//Añadimos el NewName al setter, para modificar el name.

		System.out.printf("Hola %s!, este es tu nuevo nombre", person.getName());

	}

	public static void main(String[] args) {
		new Main().show();

	}

}
