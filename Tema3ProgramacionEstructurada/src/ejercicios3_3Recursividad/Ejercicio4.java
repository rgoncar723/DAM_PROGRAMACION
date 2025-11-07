package ejercicios3_3Recursividad;

import java.util.Scanner;

public class Ejercicio4 {
	@SuppressWarnings("resource")
	public void exercise4() {
		/*
		 * Realiza una función recursiva que reciba una cadena de caracteres e indique
		 * si es o no palíndroma, es decir, si se lee igual de izquierda a derecha que
		 * de derecha a izquierda, sin tener en cuenta espacios ni mayúsculas. Ejemplo:
		 * “Dabale arroz a la zorra el abad” es palíndroma.
		 */
		String cadena;
		boolean palindromo = true;
		System.out.println("Escriba una cadena de texto para saber si es palíndroma");
		Scanner keyboard = new Scanner(System.in);
		cadena = keyboard.nextLine();
		palindromo = palindroma(cadena);
		
		if(palindromo) {
			System.out.println("La cadena es palíndroma");
		} else {
			System.out.println("La cadena NO es palíndroma");
		}

	}

	public boolean palindroma(String cadena) {
		cadena = cadena.toLowerCase().replace(" ","");
		if(cadena.length()<=1) {
			return true;	
		}else if (cadena.charAt(0)==cadena.charAt(cadena.length()-1)){
			return palindroma(cadena.substring(1,cadena.length()-1));
		}else {
			return false;
		}

	}

	public static void main(String[] args) {
		new Ejercicio4().exercise4();
	}

}
