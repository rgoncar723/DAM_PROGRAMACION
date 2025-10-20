package Ejercicios1_3Wrappers;


public class Ejercicio2 {
	
	public void exercise2() {
		/*
		 * Investiga en la API de Java para qué sirven los siguientes métodos de la clase Integer. 
		 * Haz en el Eclipse un ejemplo de utilización para cada uno
		 */
		//1. byte byteValue()
		//Su función es devolver el valor del objeto como un tipo primitivo byte
		
		Integer number = 89;
		byte number3 = number.byteValue();
		System.out.println("Apartado 1: " + number3);
		
		//2. int intValue()
		// Su función es devolver el valor primitivo int que contiene un objeto numérico.
		Integer number2 = 34;
		int number4 = number2.intValue();
		System.out.println("Apartado 2: " + number4);
		//3. double doubleValue()
		//Su función es devolver el valor primitivo double que contiene un objeto numérico.
		Double number5 = 4.56;
		double number6 = number5.doubleValue();
		System.out.println("Apartado 3: " + number6);
		//4. static String toHexString(int i)
		//Su función es convertir un número entero (int) en una cadena (String) que representa ese número en formato hexadecimal.
		
		String text2 = Integer.toHexString(2018);
		System.out.println("Apartado 4: "+ text2);
		
		//5. static int parseInt(String s)
		//Su función es convertir una cadena de texto (String) que contiene un número entero en un valor primitivo int.
		int number7 = Integer.parseInt("1234");
		System.out.println("Apartado 5: "+ number7);
		//6. static Integer valueOf(int i)
		//Sirve para convertir un valor primitivo int en un objeto Integer.
		int number8 = 2108;
		Integer number9 = Integer.valueOf(number8);
		System.out.println("Apartado 6: " + number9);
		//7. static Integer valueOf(String s)
		//Sirve para convertir una cadena de texto (String) que contiene un número entero en un objeto Integer.
		String text3 = "2007";
		Integer number10 = Integer.valueOf(text3);
		System.out.println("Apartado 7: " + number10);
		
		
	}

	public static void main(String[] args) {
		new Ejercicio2(). exercise2();
	}

}
