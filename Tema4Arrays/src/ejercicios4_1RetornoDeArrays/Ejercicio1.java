package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exersice1() {
		/*
		 * Realiza una función que reciba un array de caracteres, un carácter y una
		 * posición. La función tiene que insertar el carácter en la posición indicada,
		 * desplazando el resto de caracteres una posición. El array debe tener la
		 * última posición libre para no perder información. No utilizar un array
		 * auxiliar, sino que el desplazamiento se tiene que hacer sobre el mismo array.
		 * La función tiene que devolver el array con el carácter insertado.
		 */
		Scanner keyboard = new Scanner (System.in);
		int position;
		char c;
		String character;
		char [] characteres= {'j', 'a', 'v', 'a', '\0'};
		System.out.printf("Introduce el caracter que deseas añadir en el array %s: ",Arrays.toString(characteres));
		character= keyboard.next();
		while(character.length()>1) {
			System.out.println("Debes introducir unicamente un caracter");
			character=keyboard.next();
		}
		c=character.charAt(0);
		System.out.printf("Introduce en que indice quieres poner el caracter %s (de 0 a 4): ",c);
		position=keyboard.nextInt();
		while(position>4||position<0) {
			System.out.println("Numero invalido, introduzca nuevamente el indice");
			position=keyboard.nextInt();
		}
		newChar(c,position,characteres);
		System.out.printf("Su nuevo array es el siguiente %s",Arrays.toString(characteres));
	
	}
	public char[] newChar(char c, int position, char...characteres) {
		if(position==characteres.length-1) {
			characteres[position]=c;
		}else {
			for(int i=characteres.length-2;i>=position;i--) {
				characteres[i+1]=characteres[i];
			}
			characteres[position]=c;
		}
		return characteres;
	}

	public static void main(String[] args) {
		new Ejercicio1().exersice1();
	}

}
