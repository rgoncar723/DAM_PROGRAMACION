package ejercicios1_1TiposDeDatosPrimitivos;

public class Ejercicio1 { //This class should be written in UpperCamelCase

	public void exercise1() { //This is the function of the class
		//Here we realize the exercise
		

		int i;
		long l;
		byte b;
		short s;
		
		l  = 3_900_750_360L;
		System.out.println(l);
		i = 40_000;
		System.out.println(i);
		b = 120;
		System.out.println(b);
		s = 25_500;
		System.out.println(s);
		
		
	}
	
	public static void main(String[] args) {
		
		new Ejercicio1().exercise1(); //Ejercicio1 is the class, and exercise1 is the function
		
	}

}
