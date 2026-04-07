package ejercicios12_1ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
	Scanner kb = new Scanner(System.in);
	ArrayList<String> strings = new ArrayList<>();
	public void show() {
		/*
		 * Realiza el siguiente menú para gestionar una lista de cadenas:
		 * 
		 * 1. Nueva lista
		 * 
		 * 2. Número de cadenas
		 * 
		 * 3. Añadir cadena
		 * 
		 * 4. Eliminar última cadena
		 * 
		 * 5. Contiene cadena
		 * 
		 * 6. Mostrar lista entera
		 * 
		 * 7. Salir
		 * 
		 * En la opción 1, se limpia la lista dejándola vacía.
		 * 
		 * En la opción 5, se pide una cadena al usuario y se le informa si dicha cadena
		 * está o no en la lista.
		 */
		
		int option = 0;
	
		do {
			menu();
			System.out.println("Escoja una opción: ");
			option = kb.nextInt();
			kb.nextLine();
			switch(option) {
			case 1 -> newList();
			case 2 -> numberOfStrings();
			case 3 -> addString();
			case 4 -> deleteLastString();
			case 5 -> System.out.println(isContained());
			case 6 -> showList();
			case 7 -> System.out.println("Saliendo...");
			default -> System.out.println("Opción no válida, intente de nuevo.");
			}
		} while (option != 7);
	}

	void menu() {
		System.out.printf("=======Menú=======\n1. Nueva lista.\n2. Número de cadenas.\n3. Añadir cadena.\n4. Eliminar última cadena.\n5. Contiene cadena.\n6. Mostrar lista entera\n7. Salir\n ");
	}
	void newList() {
		strings.clear();
	}
	void numberOfStrings() {
		
		System.out.printf("El numero de cadenas es de %d\n",strings.size());
	}
	void addString() {
		String newString;
		System.out.println("Introduzca el mensaje que va a añadir a la lista");
		newString = kb.nextLine();
		strings.add(newString);
		
	}
	void deleteLastString() {
		if(strings.isEmpty()) {
			System.out.println("La lista esta vacía");
		}else {
			strings.remove(strings.size()-1);
		}
	}
	String isContained() {
		
		String message;
		System.out.println("Introduzca la palabra a buscar (Tenga en cuenta las mayúsuclas, minúsculas, y signos de puntuación)");
		message = kb.nextLine();
		return strings.contains(message) ? "Si se encuentra en la lista" : "No se encuentra en la lista." ;
	}
	void showList() {
		for (String s : strings) {
		    System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Main3().show();

	}

}
