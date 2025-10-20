package Ejercicios1_4MetodosDeString;

public class Ejercicio3 {
	public void exercise3() {
		String s="I love weekends";
		String s2="i love weekends";
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();
	}

}
