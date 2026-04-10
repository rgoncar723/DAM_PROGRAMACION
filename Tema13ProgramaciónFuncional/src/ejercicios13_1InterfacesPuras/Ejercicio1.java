package ejercicios13_1InterfacesPuras;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Ejercicio1 {
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
	int [] array = {1,2,3,4,5,6,7,8};
	
	public void showArray(Consumer<Integer> consumer) {
		for(int i : array) {
			consumer.accept(i);
		}
	}
	public void showArray(BiConsumer<Integer,Integer>biconsumer) {
		for(int i=0; i<array.length;i++) {
			biconsumer.accept(i, array[i]);
		}
	}
	public int countArray(Predicate<Integer>predicate) {
		int counter = 0;
		for(int i : array) {
			if(predicate.test(i)) {
				counter++;
			}
		}
		return counter;
	}
	public int[] filterArray(Predicate<Integer>predicate) {
		int [] newArray;
		int num = 0;
		int count = countArray(predicate);
		newArray = new int[count];
		for(int i : array) {
			if(predicate.test(i)) {
				newArray[num] = i;
				num++;
			}
		}
		return newArray;
	}
	public int[] transformArray(UnaryOperator<Integer> unaryOper) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = unaryOper.apply(array[i]);
		}
		return newArray;
	}

}
