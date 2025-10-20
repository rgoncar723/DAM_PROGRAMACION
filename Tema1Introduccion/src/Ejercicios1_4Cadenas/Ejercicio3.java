package Ejercicios1_4Cadenas;

public class Ejercicio3 {
	public void exercise3() {
		  StringBuilder text = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		  System.out.println(text);
		  text.insert(23, "adipiscing");
		  System.out.printf("Despues de agregar: "+ text);
		  text.delete(10, 27);
		  System.out.printf("Despues de eleminar: " + text);
		  text.reverse();
		  System.out.printf("Despues de revertir: " + text);
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();

	}

}
