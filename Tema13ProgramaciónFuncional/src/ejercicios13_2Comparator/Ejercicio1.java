package ejercicios13_2Comparator;

import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {
	public void ordenNatural(List<String> list) {
		list.sort(Comparator.naturalOrder());
		list.forEach(System.out::println);
	}
	public void ordenInverso(List<String>list) {
		list.sort(Comparator.reverseOrder());
		list.forEach(System.out::println);
	}
	public void ordenNullsFirst(List<String>list) {
		list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
		list.forEach(System.out::println);
	}
	public void ordenNullLast(List<String>list) {
		list.sort(Comparator.nullsLast(Comparator.reverseOrder()));
		list.forEach(System.out::println);
	}

}
