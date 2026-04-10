package ejercicios13_2Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
	public void show() {
		Ejercicio1 ex1 = new Ejercicio1();
		List<String> names = new ArrayList<>();
		List<String> namesNull = Arrays.asList("Mario", "Carlos", "Manuel", "Benjamin", null);
		names.add("Pedro");
		names.add("Raul");
		names.add("Raquel");
		names.add("Juana");
		names.add("Javier");
		names.add("Andrea");
		names.add("Bartolomeo");
		names.add("Catalina");

		System.out.println("Orden natural");
		ex1.ordenNatural(names);
		System.out.println("Orden natural inverso");
		ex1.ordenInverso(names);

		System.out.println("Orden natural con nullFirst");
		ex1.ordenNullsFirst(namesNull);
		System.out.println("Orden natural inverso con nullLast");
		ex1.ordenNullLast(namesNull);

	}

	public static void main(String[] args) {
		new Main1().show();

	}

}
