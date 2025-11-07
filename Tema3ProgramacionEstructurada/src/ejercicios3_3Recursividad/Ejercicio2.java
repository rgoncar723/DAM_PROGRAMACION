package ejercicios3_3Recursividad;

import java.util.Scanner;

public class Ejercicio2 {
	@SuppressWarnings("resource")
	public void exercise2() {
		// Realiza una función recursiva que reciba una cadena y devuelva el número de
		// vocales que tiene.
		String text;
		int index=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escribe una cadena de texto: ");
		text = keyboard.nextLine();
		countingVowels(text,index);
		System.out.printf("La cantidad de vocales que tiene esta cadena son: %d", countingVowels(text,index));

	}

	public int countingVowels(String text, int index) {
		 // Caso base: llegamos al final de la cadena
	    if (index >= text.length()) {
	        return 0;
	    }
	    char caracter = Character.toLowerCase(text.charAt(index));
	    boolean isAVowel = (caracter == 'a' || caracter == 'e' || 
	                      caracter == 'i' || caracter == 'o' || 
	                      caracter == 'u');
	    
	    // Llamada recursiva con el siguiente índice
	    return (isAVowel ? 1 : 0) + countingVowels(text, index + 1);
	}
		

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
