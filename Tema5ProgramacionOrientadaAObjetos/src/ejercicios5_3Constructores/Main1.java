package ejercicios5_3Constructores;

import java.util.Scanner;

public class Main1 {
	@SuppressWarnings("resource")
	public void show() {
		//Declaracion de variables y creacion de objeto 
		Person1 person = new Person1();
		Scanner keyboard = new Scanner(System.in);
		int newAge;
		String newName, newJob, newStarSign;
		float newHeight;
		
		//Salida por pantalla
		System.out.println(person); 
		System.out.println("Actualice sus datos ");
		System.out.println("Nombre:");
		newName=keyboard.nextLine();
		System.out.println("Trabajo:");
		newJob=keyboard.nextLine();
		System.out.println("Signo zodiacal:");
		newStarSign=keyboard.nextLine();
		System.out.println("Edad:");
		newAge=keyboard.nextInt();
		System.out.println("Altura");
		newHeight=keyboard.nextFloat();
		//Set
		person.setAge(newAge);
		person.setHeight(newHeight);
		person.setJob(newJob);
		person.setStarSign(newStarSign);
		person.setName(newName);
		//Salida por pantalla
		System.out.println(person);
	}

	public static void main(String[] args) {
		new Main1().show();

	}

}
