package ejericios12_9PilasYColas;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {
	/*
	 * Ejercicio 1 Realiza el siguiente menú para gestionar una pila de números de
	 * tipo byte:
	 * 
	 * Nueva pila
	 * 
	 * Consultar elemento
	 * 
	 * Añadir elemento
	 * 
	 * Eliminar elemento
	 * 
	 * Consultar toda la pila
	 * 
	 * Salir
	 * 
	 * 
	 */
	public void show() {
		int opcion = 0;
		Deque<Byte> dequeByte = new ArrayDeque<>();
		ConsoleInput ci = new ConsoleInput();
		
		
		do {
			menu();
			System.out.println("Escoja una opción");
			opcion = ci.readInt();
			switch(opcion) {
			case 1 -> nuevaPila(dequeByte);
			case 2 -> comprobarElemento(dequeByte,ci);
			case 3 -> añadirElemento(dequeByte,ci);
			case 4 -> eliminarElemento(dequeByte);
			case 5 -> ConsultarPila(dequeByte);
			case 6 -> System.out.println("Saliendo...");
			default -> System.out.println("Opción no válida, intente de nuevo.");
			}
			
		}while(opcion !=6);
	}
	void menu() {
		System.out.printf("Menu:\n1.Nueva Pila.\n2.Consultar elemento.\n3.Añadir elemento.\n4.Eliminar elemento.\n5.Consultar toda la pila.\n6.salir.\n");
	}
	void nuevaPila(Deque<Byte> dByte){
		dByte.clear();
		System.out.println("Pila vaciada correctamente.");
	}
	
	void añadirElemento(Deque<Byte> dByte,ConsoleInput ci) {
		byte number;
		System.out.print("Introduzca el byte a añadir: ");
        number = (byte) ci.readInt();
        dByte.push(number); 
        System.out.println("Elemento añadido.");
		
		
	}
	void eliminarElemento(Deque<Byte> dByte){
		byte element;
		if(dByte.isEmpty()) {
			System.out.println("Error: La pila esta vacía");
		}else {
			element = dByte.pollFirst();
            System.out.println("Se ha eliminado: " + element);
		}
		
	}
	void comprobarElemento(Deque<Byte> dByte , ConsoleInput ci) {
		byte element;
		System.out.println("Escriba el elemento a comprobar");
		element = (byte) ci.readInt();
		if(dByte.contains(element)) {
			System.out.println("El elemento introducido si se encuentra en la pila");
		}else {
			System.out.println("El elemento no se ecuentra en la pila");
		}
		
	
	}
	void ConsultarPila(Deque<Byte> dByte) {
		if(dByte.isEmpty()) {
			System.out.println("La pila esta vacía");
		}
		for(Byte b : dByte){
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
