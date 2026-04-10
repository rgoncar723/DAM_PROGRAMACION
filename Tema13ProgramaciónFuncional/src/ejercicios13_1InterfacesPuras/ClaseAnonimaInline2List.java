package ejercicios13_1InterfacesPuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ClaseAnonimaInline2List {
	public void show() {
		Ejercicio2 ex1;
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		ex1 = new Ejercicio2(numbers);
		List<Integer> array2 = new ArrayList<>();
		
		
		int count;
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
		System.out.println(array2.toString());
		System.out.println("filterArray para filtar impares: ");
		array2 = ex1.filterArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 != 0;
			}
		});
		System.out.println(array2.toString());
		System.out.println("filterArray para los mayores de 3: ");
		array2 = ex1.filterArray(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num > 3;
			}
		});
		System.out.println(array2.toString());
		System.out.println("transformArray para obtener el doble: ");
		array2 = ex1.transformArray(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer num) {
				return num * 2;
			}
		});
		System.out.println(array2);
		System.out.println("transformArray para obtener el triple: ");
		array2 = ex1.transformArray(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer num) {
				return num * 3;
			}
		});
		System.out.println(array2.toString());

	}

	public static void main(String[] args) {
		new ClaseAnonimaInline2List().show();

	}

}
