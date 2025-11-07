package ejercicios3_3Recursividad;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza una función recursiva que reciba una cadena y devuelva otra cadena
	 * con los caracteres en orden inverso. Por ejemplo, si recibe "hola", devuelve
	 * "aloh".
	 */
	@SuppressWarnings("resource")
	public void exercise5() {
		String cadena;
		System.out.println("Escriba una cadena de texto");
		Scanner keyboard = new Scanner(System.in);
		cadena = keyboard.nextLine();
		cadena = cadena.toLowerCase().replace(" ","");
		idk(cadena);
		System.out.print(idk(cadena));
	}

	public String idk(String cadena) {
		if (cadena.length() == 0) {
			// Caso base.
			return cadena;
		} else {

			return cadena.charAt(cadena.length() - 1) + idk(cadena.substring(0, cadena.length() - 1));
			/*
			 * Cada llamada toma el último carácter y lo pone al principio.
			 * 
			 * La recursión se encarga de invertir el resto de la cadena
			 * 
			 * El caso base detiene el proceso y permite la reconstrucción
			 */
		}

	}

	public static void main(String[] args) {
		new Ejercicio5().exercise5();

	}

}
