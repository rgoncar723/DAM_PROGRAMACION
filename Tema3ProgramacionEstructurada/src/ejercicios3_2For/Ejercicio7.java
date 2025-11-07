package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio7 {
	@SuppressWarnings("resource")
	public void exercise7() {
		/*
		 * Realiza una función que reciba una cadena y devuelva el número de palabras
		 * que tiene. Hacer las comparaciones a nivel de carácter. No se pueden utilizar
		 * métodos replace, indexOf ni trim. Las palabras dentro de la cadena pueden
		 * estar separadas por más de un espacio. No se pueden eliminar los espacios de
		 * la cadena. Por ejemplo, si recibe
		 * "   Estoy         matriculado      en        Programación       en         Entornos         y        en               Marcas    "
		 * , devuelve 9.
		 * 
		 */
		int counter = 0; //Inicializa el contador de palabras en 0
		boolean isAWord = false; //Indica si estamos dentro de una palabra (inicia en falso)
		String s;
		char c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escribe una cadena de texto: ");
		s = keyboard.nextLine();
		int i;
		for (i = 0; i < s.length(); i++) { //Inicia bucle que recorre cada carácter de la cadena
			c = s.charAt(i); //Obtiene el carácter en la posición actual

			if (c != ' ') {
				// Si no es espacio y no estábamos en una palabra
				if (!isAWord) {
					isAWord = true;
					counter++; //Incrementamos el contador de palabras (nueva palabra encontrada)
				} 
			}else {
				   // Si es espacio, marcamos que no estamos en palabra
					isAWord = false;
				}
		}
		System.out.printf("En la cadena anterior hay %d palabras", counter);
	}

	public static void main(String[] args) {
		new Ejercicio7().exercise7();

	}

}
