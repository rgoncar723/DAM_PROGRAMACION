package Ejercicios1_4MetodosDeString;

import java.util.Random;

public class Ejercicio2 {

	public void excercise2() {
		String text="I love weekends";
		Random r = new Random();
		char c =text.charAt(r.nextInt(text.length()));
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Ejercicio2().excercise2();

	}

}
