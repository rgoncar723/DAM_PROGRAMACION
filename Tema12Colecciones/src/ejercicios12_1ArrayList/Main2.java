package ejercicios12_1ArrayList;

import java.util.ArrayList;


public class Main2 {

	public void show() {
		// Realiza un método genérico que reciba una lista y la devuelva invertida.
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add("Hola");
		list1.add("Aloh");
		list1.add("Adios");
		list1.add("Soida");
		list1.add("Bye");
		list1.add("Eyb");
		// ____________________
		list2.add(2108);
		list2.add(2007);
		list2.add(2804);
		list2.add(2007);
		list2.add(609);
		list2.add(2025);
		System.out.println("Lista 1");
		System.out.println(list1);
		System.out.println("Invertida");
		System.out.println(invertirLista(list1));
		// _____________________
		System.out.println("Lista 2");
		System.out.println(list2);
		System.out.println("Invertida");
		System.out.println(invertirLista(list2));

	}

	public <T> ArrayList<T> invertirLista(ArrayList<T> listaOriginal) {
		ArrayList<T> resultado = new ArrayList<>();
		for (int i = listaOriginal.size() - 1; i >= 0; i--) {
			resultado.add(listaOriginal.get(i)); //Saca lo que hay en la posición i y lo añade a la lista resultado.
		}
		return resultado;
	}

	public static void main(String[] args) {
		new Main2().show();
	}

}
