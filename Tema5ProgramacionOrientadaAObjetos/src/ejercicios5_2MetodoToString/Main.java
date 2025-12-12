package ejercicios5_2MetodoToString;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public void show() {
		// Declaracion de variables, creacion de un objeto
		Person person = new Person();
		int newAge;
		String newName, newJob, newStarSign;
		float newHeight;
		Scanner keyboard = new Scanner(System.in);
		// Salida por consola
		System.out.println(person);
		// Pedirle datos al usuario
		System.out.println("Actualice sus datos");
		System.out.println("Introduzca su nuevo nombre");
		newName = keyboard.nextLine();
		System.out.println("Introduzca su nuevo trabajo");
		newJob = keyboard.nextLine();
		System.out.println("Introduzca su signo zodiacal");
		newStarSign = keyboard.nextLine();
		System.out.println("Introduzca su altura");
		newHeight = keyboard.nextFloat();
		System.out.println("Introduzca su edad");
		newAge=keyboard.nextInt();
		//Set
		person.setAge(newAge);
		person.setHeight(newHeight);
		person.setStarSign(newStarSign);
		person.setJob(newJob);
		person.setName(newName);
		//Salida por consila
		System.out.println(person);
	}

	public static void main(String[] args) {
		new Main().show();
	}

}
