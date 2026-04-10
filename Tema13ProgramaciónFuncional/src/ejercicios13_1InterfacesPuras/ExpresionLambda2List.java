package ejercicios13_1InterfacesPuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpresionLambda2List {
	public void show() {
		Ejercicio2 ex2;
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		ex2 = new Ejercicio2(numbers);
		List<Integer> array2 = new ArrayList<>();
		int count;
		System.out.println("Usando expresiones lambda");
		System.out.println("ShowArray para mostrar todos los elementos en la misma línea: ");
		ex2.showArray(n -> System.out.printf("%d ", n));
		System.out.println("ShowArray para mostrar todos los elementos cada uno en una línea: ");
		ex2.showArray(n -> System.out.println(n));
		System.out.println("ShowArray para mostrar  los elementos con su índice: ");
		ex2.showArray((c, n) -> System.out.printf("Elemento %d: %d\n", c, n));
		System.out.println("countArray para contar pares: ");
		count = ex2.countArray(n -> n % 2 == 0);
		System.out.println(count);
		System.out.println("countArray para contar impares: ");
		count = ex2.countArray(n -> n % 2 != 0);
		System.out.println(count);
		System.out.println("countArray para contar mayores de 3: ");
		count = ex2.countArray(n -> n > 3);
		System.out.println(count);
		System.out.println("filterArray para filtar pares: ");
		array2 = ex2.filterArray(n -> n % 2 == 0);
		System.out.println(array2.toString());
		System.out.println("filterArray para filtar impares: ");
		array2 = ex2.filterArray(n -> n % 2 != 0);
		System.out.println(array2.toString());
		System.out.println("filterArray para filtar mayores que 3: ");
		array2 = ex2.filterArray(n -> n > 3);
		System.out.println(array2.toString());
		System.out.println("transformArray para obtener el doble: ");
		array2 = ex2.transformArray(n -> n*2);
		System.out.println(array2.toString());
		System.out.println("transformArray para obtener el triple: ");
		array2 = ex2.transformArray(n -> n*3);
		System.out.println(array2.toString());

	}

	public static void main(String[] args) {
		new ExpresionLambda2List().show();

	}

}