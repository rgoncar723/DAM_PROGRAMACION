package ejercicios6_1Excepciones;

import java.util.Scanner;

public class Ejercicio2 {
	public void show() {
		Scanner kb = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(kb);
		System.out.println(ci.readInt());
		System.out.println(ci.readIntLessOrEqualThan(34));
		System.out.println(ci.readIntGreaterThan(34));
		System.out.println(ci.readIntGreaterOrEqualThan(34));
		System.out.println(ci.readIntInRange(34, 68));
		System.out.println(ci.readDouble());
		System.out.println(ci.readDoubleLessThan(5.5));
		System.out.println(ci.readDoubleLessOrEqualThan(5.5));
		System.out.println(ci.readDoubleGreaterThan(5.5));
		System.out.println(ci.readDoubleGreaterOrEqualThan(5.5));
		System.out.println(ci.readDoubleInRange(2.5, 5.5));
		System.out.println(ci.readChar());
		System.out.println(ci.readString());
		System.out.println(ci.readString(8));
		System.out.println(ci.readStringNotEmpty());
		System.out.println(ci.readBooleanUsingChar('s', 'n'));
	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
