package ejercicios13_1InterfacesPuras;

import java.util.Arrays;

public class ExpresionLambda {
	public void show() {
		Ejercicio1 ex1 = new Ejercicio1();
		int count;
		int[] array2;
		System.out.println("Usando expresiones lambda");
		System.out.println("ShowArray para mostrar todos los elementos en la misma línea: ");
		ex1.showArray(n -> System.out.printf("%d ", n));
		System.out.println("ShowArray para mostrar todos los elementos cada uno en una línea: ");
		ex1.showArray(n -> System.out.println(n));
		System.out.println("ShowArray para mostrar  los elementos con su índice: ");
		ex1.showArray((c, n) -> System.out.printf("Elemento %d: %d\n", c, n));
		System.out.println("countArray para contar pares: ");
		count = ex1.countArray(n -> n % 2 == 0);
		System.out.println(count);
		System.out.println("countArray para contar impares: ");
		count = ex1.countArray(n -> n % 2 != 0);
		System.out.println(count);
		System.out.println("countArray para contar mayores de 3: ");
		count = ex1.countArray(n -> n > 3);
		System.out.println(count);
		System.out.println("filterArray para filtar pares: ");
		array2 = ex1.filterArray(n -> n % 2 == 0);
		System.out.println(Arrays.toString(array2));
		System.out.println("filterArray para filtar impares: ");
		array2 = ex1.filterArray(n -> n % 2 != 0);
		System.out.println(Arrays.toString(array2));
		System.out.println("filterArray para filtar mayores que 3: ");
		array2 = ex1.filterArray(n -> n > 3);
		System.out.println(Arrays.toString(array2));
		System.out.println("transformArray para obtener el doble: ");
		array2 = ex1.transformArray(n -> n*2);
		System.out.println(Arrays.toString(array2));
		System.out.println("transformArray para obtener el triple: ");
		array2 = ex1.transformArray(n -> n*3);
		System.out.println(Arrays.toString(array2));

	}

	public static void main(String[] args) {
		new ExpresionLambda().show();

	}

}