package Ejercicios1_4MetodosDeString;

public class Ejercicio13 {
	public void exercise13() {
		String s1="hello world";
		String s2="Hello Galaxy";
		boolean s=s1.regionMatches(true, 0,  s2, 0, 4);
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Ejercicio13().exercise13();

	}

}
