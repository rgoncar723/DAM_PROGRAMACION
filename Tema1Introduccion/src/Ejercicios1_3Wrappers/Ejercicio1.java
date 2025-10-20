package Ejercicios1_3Wrappers;

public class Ejercicio1 {
	public void exercise1() {
	/*
	 * Investiga en la API de Java para qué sirven los siguientes métodos de la clase Character.
	 *  Haz en el Eclipse un ejemplo de utilización para cada uno
	 */
	//1. char charValue()
	//Returns the value of this Character object.	Sirve para obtener el valor primitivo char que almacena un objeto Character.
		Character character = 'r';
		char c3 = character. charValue();
		System.out.println("char value: "+ c3); 
	//2. static boolean isDigit(char ch)
	//Determines if the specified character is a digit. Determina si el caracter especifico es un digito.
		System.out.println("Is r a digit: "+ Character.isDigit(character));
		System.out.println("Is 8 a digit: " + Character.isDigit('8'));
	//3. static boolean isUpperCase(char ch)	
	//Determines if the specified character is an uppercase character. Determina si el caracter especifico esta en mayuscula.
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isUpperCase('8'));
		System.out.println(Character.isUpperCase('e'));
	//4. static char toLowerCase(char ch)
	//Converts the character argument to lowercase using case mapping information from the UnicodeData file. Su función es convertir una letra mayúscula a minúscula.
		System.out.println("A lowercase: "+Character.toLowerCase('A'));
	//5. static Character valueOf(char c)
	//Sirve para convertir un valor primitivo char en un objeto Character.
		char Character2 = 'd';
		Character c4 = Character.valueOf(Character2);
		System.out.println("Char value: "+ c4);
	}

	public static void main(String[] args) {
		new Ejercicio1(). exercise1();

	}

}
