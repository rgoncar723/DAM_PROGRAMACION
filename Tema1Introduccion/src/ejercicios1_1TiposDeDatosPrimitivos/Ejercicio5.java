package ejercicios1_1TiposDeDatosPrimitivos;

public class Ejercicio5 {

	public void exercise5() {
		
		char character;
		
		
		character = 'P';
		System.out.println(character);
		character= 80;  // El código Unicode de la P.
		System.out.println(character);
				
		character = '\u0050'; // El código Unicode de la P en hexadecimal
		System.out.println(character);
		
	}
	
	public static void main(String[] args) {
		
		new Ejercicio5().exercise5();
	}

}
