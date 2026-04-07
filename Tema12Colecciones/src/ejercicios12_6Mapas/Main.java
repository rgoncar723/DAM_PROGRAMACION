package ejercicios12_6Mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public void show() {
		/*
		 * Una biblioteca quiere llevar un registro de los préstamos realizados a sus
		 * socios. De cada libro se almacena el ISBN (código numérico que identifica de
		 * manera única un libro), titulo y autor. La biblioteca solamente dispone de un
		 * ejemplar por cada libro.
		 * 
		 * Realiza un programa que registre cuántas veces se ha prestado cada libro.
		 * Utiliza para ello un mapa con el libro como clave y un entero para el valor,
		 * donde se almacene el número de préstamos, de tal forma que:
		 * 
		 * Si el libro ya está registrado, se incrementa el número de préstamos.
		 * 
		 * Si no está, se añade con valor 1.
		 * 
		 * A continuación, el programa debe mostrar la información registrada de tres
		 * maneras distintas:
		 * 
		 * Mostrar todos los títulos de libros prestados.
		 * 
		 * Mostrar únicamente los números de préstamos.
		 * 
		 * Mostrar las parejas libro-número de préstamos, accediendo tanto a la clave
		 * como al valor.
		 * 
		 * Por último, el programa le pide los datos al usuario de un ISBN para:
		 * 
		 * Consultar cuántas veces se ha prestado.
		 * 
		 * Eliminar el libro correspondiente. Tras la eliminación, se volverán a mostrar
		 * las parejas libro-número de préstamos para verificar que efectivamente se ha
		 * borrado.
		 */
		boolean exit = false;
		ConsoleInput ci = new ConsoleInput();
		List<Libro>libros = rellenarLibros(ci);
		Map<Libro,Integer> map = rellenarMapa(libros);
		imprimirTitulos(map);
		numeroPrestamo(map);
		parValor(map);
		while(!exit) {
			prestamos(map,ci);
			parValor(map);
			System.out.println("Introduzca s si desea consultar otro libro o n si quieres salir");
			exit = ci.readBooleanUsingChar('s','n');
		}
		
		
	}
	public List<Libro> rellenarLibros(ConsoleInput ci){
		int cantidad;
		int isbn;
		String titulo,autor;
		List<Libro> libros = new ArrayList<>();
		System.out.println("Ingrese cuantos libros desea ingresar");
		cantidad = ci.readInt();
		for(int i = 0; i<cantidad; i++) {
			System.out.printf("Ingrese el ISBN, el titulo y el autor del libro %d.\n Recuerde que para incluir los valores debe darle a la tecla ENTER\n",i+1);
			isbn = ci.readInt();
			titulo = ci.readString();
			autor = ci.readString();
			libros.add(new Libro(isbn,titulo,autor));
		}
		return libros;
	}
	public Map<Libro,Integer> rellenarMapa (List<Libro> libros){
		Map<Libro,Integer> mapa = new HashMap<>();
		for(Libro l: libros) {
			if(mapa.containsKey(l)) {
				mapa.put(l, mapa.get(l)+1);
			}else {
				mapa.put(l, 1);
			}
		}
		return mapa;
	}
	//Mostrar los titulos de libros prestados
	public void imprimirTitulos(Map<Libro,Integer>mapa) {
		for(Libro l: mapa.keySet()) {
			System.out.println(l.getTitulo());
		}
	}
	//Mostrar únicamente los números de préstamos.
	public void numeroPrestamo(Map<Libro,Integer>mapa) {
		for(Integer i: mapa.values()) {
			System.out.println(i);
		}
	}
	//Mostrar las parejas libro-número de préstamos, accediendo tanto a la clave como al valor.
	public void parValor(Map<Libro,Integer>mapa) {
		for(Map.Entry<Libro,Integer> e: mapa.entrySet()) {
			System.out.printf("ISBN -> %s\n Libro -> %s\n",e.getKey(),e.getValue());
		}
	}
	public void prestamos(Map<Libro,Integer>mapa,ConsoleInput ci) {
		int isbn;
		System.out.println("Introduzca el ISBN Para consultar la cantidad de veces que ha sido prestado y proceder con su eliminación");
		isbn = ci.readInt();
		comprobarISBN(mapa, new Libro(isbn,"???","???"));
	}
	public void comprobarISBN(Map<Libro,Integer>mapa,Libro libro) {
		if(mapa.containsKey(libro)) {
			System.out.println(mapa.get(libro));
			mapa.remove(libro);
		}else {
			System.out.println("No existe ningún libro con ese ISBN, se va añadir con autor y titulo desconocido");
			mapa.put(libro, 1);
		}
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
