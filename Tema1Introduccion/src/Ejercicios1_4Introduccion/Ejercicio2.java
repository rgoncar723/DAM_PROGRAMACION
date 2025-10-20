package Ejercicios1_4Introduccion;

public class Ejercicio2 {
	public void exercise2() {
		String text1 = "Coding";
		String text2 = new String ("Coding");
		System.out.println(text1==text2); //no tienen la misma direccion de memoria
		System.out.println(text1.equals(text2));//El contenido es el mismo.
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
