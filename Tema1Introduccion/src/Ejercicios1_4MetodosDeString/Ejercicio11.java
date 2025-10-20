package Ejercicios1_4MetodosDeString;

public class Ejercicio11 {
	public void exercise11() {
		String s1=("banana, banana, i do not like banana, okay, do not like banana");
		String r= s1.replace("banana", "coffee");
		System.out.println(r);
		
	}

	public static void main(String[] args) {
		new Ejercicio11().exercise11();

	}

}
