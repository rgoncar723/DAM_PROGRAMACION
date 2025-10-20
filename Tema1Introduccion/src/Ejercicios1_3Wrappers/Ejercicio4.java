package Ejercicios1_3Wrappers;

public class Ejercicio4 {
	public void exercise4() {
	/*
	 * Declara un booleano, un entero, un carácter y un decimal. 
	 * Inicialízalas. Luego, transforma todas las variables a variables cadena.
	 *  Luego, obtener una cadena resultante de concatenar todas las cadenas obtenidas anteriormente.
	 *  Muestra esta cadena resultante por pantalla.	
	 */
		boolean b1 = true;
		int num1 = 18;
		char c1 = 'R';
		double d1 =1.63;
		
		String num2 = String.valueOf(num1);
		String dou2 = String.valueOf(d1);
		String c2 = String.valueOf(c1);
		String b2 = String.valueOf(b1);
		String result = num2 + dou2 + c2 + b2;
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		new Ejercicio4(). exercise4();

	}

}
