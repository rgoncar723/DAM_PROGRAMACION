package ejercicios12_3ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	void show() {
		/*
		 * Realiza el siguiente menú para gestionar una lista de números decimales de
		 * tipo float:
		 * 
		 * Mostrar la lista
		 * 
		 * Mostrar siguiente
		 * 
		 * Mostrar anterior
		 * 
		 * Añadir elemento
		 * 
		 * Eliminar el último mostrado
		 * 
		 * Sustituir el último mostrado
		 * 
		 * Salir
		 * 
		 * En la opción 2, la primera vez que se ejecute saldrá el primero de la lista.
		 * La siguiente vez el segundo, y así sucesivamente. Si el último mostrado ha
		 * sido el último y se le vuelve a dar a esta opción, entonces se mostrará el
		 * primero.
		 * 
		 * En la opción 3, lo mismo pero con el anterior.
		 * 
		 * En la opción 4, se añade el elemento por donde esté el iterador.
		 * 
		 * En la opción 6, se le pedirá al usuario el nuevo valor para sustituir.
		 *
		 */
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		List<Float> it = new ArrayList<>(); // Lista de numeros
		ListIterator<Float> list = it.listIterator(); // Iterador
		int option = 0;
		
		do {
			menu();
			System.out.println("Opción: ");
			option = kb.nextInt();
			switch (option) {
			case 1 -> {
				for (Float f : it) {
					System.out.println(f);
				}
				if(it.isEmpty()) {
					System.out.println("La lista esta vacía");
				}
			}
			case 2 -> {
				if (!list.hasNext()) {
					list = it.listIterator();
				}
				System.out.println(list.next());
			}
			case 3 -> {
				if (!list.hasPrevious()) {
					list = it.listIterator(it.size()); //Vuelve al final 
				}
				System.out.println(list.previous());
			}
			case 4 -> {
				float number;
				System.out.println("Por favor escriba un numero decimal para añadir a la lista");
				number = kb.nextFloat();
				list.add(number);
			}
			case 5 -> {
				try {
					list.remove();
				} catch (IllegalStateException e) {
					System.out.println("Primero debes introducir un numero");
				} finally {
					kb.nextLine();
				}

			}
			case 6 -> {
				try {
					float number;
					System.out.println("Introduce el valor por el que quieras cambiar la lista");
					number = kb.nextFloat();
					list.set(number);
				}catch(IllegalStateException e) {
					System.out.println("Primero debes mostrar un elemento");
				}

			}
			case 7 -> System.out.println("Saliendo...");
			default -> System.out.println("Valor incorrecto...Por favor introduzca una opción válida.");
			}

		} while (option != 7);

	}

	void menu() {
		System.out.printf(
				"=====Menú=====\n 1. Mostrar la lista\n 2. Mostrar siguiente\n 3. Mostrar anterior\n 4. Añadir elemento\n 5. Eliminar el último mostrado\n 6. Sustituir el último mostrado\n 7. Salir\n");
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
