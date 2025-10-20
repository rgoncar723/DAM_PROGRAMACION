package Ejercicios2_2LecturaPorTeclado;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
	public void exercise1() {
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\\n");
		String str;
		int i;
		float f;
		boolean b;
		System.out.println("Hello, I'm gonna ask you some questions 'bout yourself. be honest, okay?");
		System.out.println("Write down your name : ");
		str = keyboard.next();
		System.out.println(str);
		System.out.println("Write down your last name : ");
		keyboard.nextLine();
		str = keyboard.next();
		System.out.println(str);
		System.out.println("Write down your age : ");
		keyboard.nextLine();
		i = keyboard.nextInt();
		System.out.println(i);
		System.out.println("Write down your adress : ");
		keyboard.nextLine();
		str = keyboard.next();
		System.out.println(str);
		System.out.println("Write down your street, number, zip code and Province : ");
		keyboard.nextLine();
		str = keyboard.next();
		System.out.println(str);
		System.out.println("Write down if you're a studen (true/false) : ");
		keyboard.nextLine();
		b = keyboard.nextBoolean();
		System.out.println(b);
		System.out.println("Write down your height) : ");
		keyboard.nextLine();
		f = keyboard.nextFloat();
		System.out.println(f); 
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}

}
