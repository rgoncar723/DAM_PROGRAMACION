package Ejercicios1_3Wrappers;

public class Ejercicio3 {
	public void exercise3() {
		//1. float floatValue()
		//Su función es devolver el valor del objeto como un tipo primitivo float.
		Float number = 5.7f;
		float number2 = number.floatValue();
		System.out.println("Apartado 1: " + number2); //5.7
		//2. double doubleValue()
		//Su función es devolver el valor del objeto como un tipo primitivo double..
		Double number3 = 7.8;
		double number4 = number3.doubleValue();
		System.out.println("Apartado 2: "+ number4); //7.8
		//3. boolean isInfinite()
		// Sirve para determinar si el valor del objeto representa infinito.
		Double number5 = (1.0/0.0);
		Double number6 = (4.0/2.0);
		System.out.println("Apartado 3: " + number5.isInfinite()); //true
		System.out.println("Apartado 3: " + number6.isInfinite()); //false
		//4. static boolean isInfinite(double v) 
		// Sirve para determinar si un valor de tipo primitivo double representa infinito. Estatico
		double number7 = (1.0/0.0);
		double number8 = (2.0/1.0);
		
		System.out.println("Apartado 4: " + Double.isInfinite(number7)); // true
		System.out.println("Apartado 4: " + Double.isInfinite(number8)); //false
		//5.boolean isNaN()
		//Sirve para determinar si el valor del objeto representa “Not a Number” (NaN).
		Double number9 = (0.0/0.0);
		Double number10= 8.3;
		System.out.println("Apartado 5: " + number9.isNaN()); //true
		System.out.println("Apartado 5: " + number10.isNaN()); //false
		//6. static double min(double a, double b)
		//Sirve para devolver el menor de dos valores de tipo double.
		double number11 = 9.10;
		double number12 = 4.5;
		System.out.println("Apartado 6: " + Double.min(number11, number12));//4.5
		//7. static double parseDouble(String s)
		//Sirve para convertir una cadena (String) que representa un número decimal en un valor primitivo double.
		double number13 = Double.parseDouble("12.34");
		System.out.println("Apartado 7: " + number13); // 12.34
		//8. static Double valueOf(double d)
		// Sirve para convertir un valor primitivo double en un objeto Double.
		double number14 =7.8;
		Double number15 = Double.valueOf(number14);
		System.out.println("Apartado 8: "+ number15);//7.8
		//9. static Double valueOf(String s)
		// Sirve para convertir una cadena (String) que representa un número decimal en un objeto Double.
		String text ="23.456";
		Double number16= Double.valueOf(text);
		System.out.println("Apartado 9: "+ number16); //23.456
		



		
	}
	public static void main(String[] args) {
		new Ejercicio3(). exercise3();

	}

}
