package ejercicios13_1InterfacesPuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Ejercicio2 {
	/*
	 * Hacer 3 versiones de este ejercicio:
	 * 
	 * Con clases anónimas inline.
	 * 
	 * Con una expresión lambda.
	 * 
	 * Con referencias a métodos (cuando se pueda).
	 * 
	 * Crea una clase que tenga el siguiente atributo: int[] array = { 1, 2, 3, 4,
	 * 5, 6, 7, 8 };
	 * 
	 * Realiza los siguientes métodos:
	 * 
	 * public void showArray(Consumer<Integer> consumer): para mostrar los elementos
	 * del array tal y como indique el consumer.
	 * 
	 * public void showArray(BiConsumer<Integer, Integer> biconsumer): para mostrar
	 * los índices y los elementos del array tal y como indique el biconsumer.
	 * 
	 * public int countArray(Predicate<Integer> predicate): devuelve cuántos
	 * elementos cumplen cierta condición.
	 * 
	 * public int[] filterArray(Predicate<Integer> predicate): devuelve un array con
	 * los elementos del array que cumplen la condición del Predicate.
	 * 
	 * public int[] transformArray(UnaryOperator<Integer> unaryOper): se transforma
	 * el array en otro array en función de un cálculo.
	 * 
	 * Método que obtenga la siguiente salida por consola utilizando los métodos
	 * anteriores:
	 */

	private List<Integer> array = new ArrayList<>();

	public Ejercicio2(List<Integer> array) {
		this.array = array;
	}

	public void showArray(Consumer<Integer> consumer) {
		for (int i : array) {
			consumer.accept(i);
		}
	}

	public void showArray(BiConsumer<Integer, Integer> biconsumer) {
		for (int i = 0; i < array.size(); i++) {
			biconsumer.accept(i, array.get(i));
		}
	}

	public int countArray(Predicate<Integer> predicate) {
		int counter = 0;
		for (int i : array) {
			if (predicate.test(i)) {
				counter++;
			}
		}
		return counter;
	}

	public List<Integer> filterArray(Predicate<Integer> predicate) {
		List<Integer> filteredList = new ArrayList<>();
		for (Integer n : array) {
			if (predicate.test(n)) {
				filteredList.add(n); // Añadimos solo los que cumplen
			}
		}
		return filteredList;
	}

	public List<Integer> transformArray(UnaryOperator<Integer> unaryOper) {
		List<Integer> transformedList = new ArrayList<>();
		for (Integer n : array) {
			transformedList.add(unaryOper.apply(n)); // Aplicamos la transformación
		}
		return transformedList;
	}
}
