package Ejercicios1_4Cadenas;

public class Ejercicio4 {
	public void exercise4() {
		String text=  "      Bienvenidos al módulo de PROGRAMACIÓN      ";
		String resultString= 
				text.trim().
				toLowerCase()
				.replace("programación", "Java");
		System.out.println(resultString);
	}

	public static void main(String[] args) {
		new Ejercicio4().exercise4();

	}

}
