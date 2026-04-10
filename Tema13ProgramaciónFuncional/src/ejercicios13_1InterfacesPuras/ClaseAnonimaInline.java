package ejercicios13_1InterfacesPuras;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ClaseAnonimaInline {
	public void show() {
		Ejercicio1 ex1 = new Ejercicio1();
		int count;
		int[] array2;
		System.out.println("Usando Inline Anonima");
		System.out.println("ShowArray para mostrar todos los elementos en la misma línea: ");
		ex1.showArray(new Consumer<Integer>() {
			@Override
			public void accept(Integer num) {
				System.out.printf("%d ", num);
			}
		});
		System.out.println();
		System.out.println("ShowArray para mostrar todos los elementos cada uno en una línea: ");
		ex1.showArray(new Consumer<Integer>() {
			@Override
			public void accept(Integer num) {
				System.out.println(num);
			}
		});
		System.out.println("ShowArray para mostrar todos los elementos con su índice: ");
		ex1.showArray(new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer count, Integer num) {
				System.out.printf("Elemento %d: %d\n", count, num);
			}
		});
		System.out.println("countArray para contar pares: ");
		count = ex1.countArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}
		});
		System.out.println(count);
		System.out.println("countArray para contar impares: ");
		count = ex1.countArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 != 0;
			}
		});
		System.out.println(count);
		System.out.println("countArray para contar los mayores de 3: ");
		count = ex1.countArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num > 3;
			}
		});
		System.out.println(count);
		System.out.println("filterArray para filtar pares: ");
		array2 = ex1.filterArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}
		});
		System.out.println(Arrays.toString(array2));
		System.out.println("filterArray para filtar impares: ");
		array2 = ex1.filterArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 != 0;
			}
		});
		System.out.println(Arrays.toString(array2));
		System.out.println("filterArrya para los mayores de 3: ");
		array2 = ex1.filterArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num > 3;
			}
		});
		System.out.println(Arrays.toString(array2));
		System.out.println("transformArray para obetner el doble: ");
		array2 = ex1.transformArray(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer num) {
				return num * 2;
			}
		});
		System.out.println(Arrays.toString(array2));
		System.out.println("transformArray para obetner el triple: ");
		array2 = ex1.transformArray(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer num) {
				return num * 3;
			}
		});
		System.out.println(Arrays.toString(array2));

	}

	public static void main(String[] args) {
		new ClaseAnonimaInline().show();

	}

}
