package ejercicios5_1Get_y_Set;

import java.util.Scanner;

public class Main2 {
	@SuppressWarnings("resource")
	public void show() {
		// Crea una clase Main que haga lo siguiente:

		// Crea una persona.

		// Muestra sus datos.

		// Solicítale al usuario nuevos datos y asígnaselos a la persona.

		// Muestra sus nuevos datos.
		// Declaracion de variables y objetos

		Person2 person = new Person2();
		int newAge;
		String newName, newWork;
		float newHeight;
		Scanner keyboard = new Scanner(System.in);

		// Salida por pantalla
		System.out.println("Mostrando sus datos");
		System.out.printf("Nombre: %s\n", person.getName());
		System.out.printf("Edad: %d\n", person.getAge());
		System.out.printf("Altura: %s\n", person.getHeight());
		System.out.printf("Trabajo: %s\n", person.getWork());
		// Pedirle que modifique la infor
		System.out.println("Por favor introduza su nombre");
		newName = keyboard.nextLine();
		person.setName(newName);
		
		System.out.println("Por favor introduza su edad");
		newAge = keyboard.nextInt();
		person.setAge(newAge);
		
		System.out.println("Por favor introduza su altura");
		newHeight = keyboard.nextFloat();
		person.setHeight(newHeight);
		keyboard.nextLine();//Limpar el buffer, importante
		System.out.println("Por favor introduzca su trabajo");
		newWork = keyboard.nextLine();
		person.setWork(newWork);

		// Salida por pantalla con los datos modificados

		System.out.println("Mostrando sus datos");
		System.out.printf("Nombre: %s\n", person.getName());
		System.out.printf("Edad: %d\n", person.getAge());
		System.out.printf("Altura: %s\n", person.getHeight());
		System.out.printf("Trabajo: %s\n", person.getWork());

	}

	public static void main(String[] args) {
		new Main2().show();

	}

}
