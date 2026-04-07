package ejericios12_9PilasYColas;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ejercicio2 {
	/*
	 * Realiza el ejercicio anterior pero con una cola.
	 */
	public void show() {
		int opcion = 0;
		Queue<Byte> dequeByte = new ArrayDeque<>();
		ConsoleInput ci = new ConsoleInput();
		
		
		do {
			menu();
			System.out.println("Escoja una opción");
			opcion = ci.readInt();
			switch(opcion) {
			case 1 -> nuevaCola(dequeByte);
			case 2 -> comprobarElemento(dequeByte,ci);
			case 3 -> añadirElemento(dequeByte,ci);
			case 4 -> eliminarElemento(dequeByte);
			case 5 -> ConsultarCola(dequeByte);
			case 6 -> System.out.println("Saliendo...");
			default -> System.out.println("Opción no válida, intente de nuevo.");
			}
			
		}while(opcion !=6);
	}
	void menu() {
		System.out.printf("Menu:\n1.Nueva Cola.\n2.Consultar elemento.\n3.Añadir elemento.\n4.Eliminar elemento.\n5.Consultar toda la cola.\n6.salir.\n");
	}
	void nuevaCola(Queue<Byte> dByte){
		dByte.clear();
		System.out.println("Cola vaciada correctamente.");
	}
	
	void añadirElemento(Queue<Byte> dByte,ConsoleInput ci) {
		byte number;
		System.out.print("Introduzca el byte a añadir: ");
        number = (byte) ci.readInt();
        dByte.add(number); 
        System.out.println("Elemento añadido.");
		
		
	}
	void eliminarElemento(Queue<Byte> dByte){
		byte element;
		if(dByte.isEmpty()) {
			System.out.println("Error: La cola esta vacía");
		}else {
			element = dByte.poll();
            System.out.println("Se ha eliminado: " + element);
		}
		
	}
	void comprobarElemento(Queue<Byte> dByte , ConsoleInput ci) {
		byte element;
		System.out.println("Escriba el elemento a comprobar");
		element = (byte) ci.readInt();
		if(dByte.contains(element)) {
			System.out.println("El elemento introducido si se encuentra en la cola");
		}else {
			System.out.println("El elemento no se ecuentra en la cola");
		}
		
	
	}
	void ConsultarCola(Queue<Byte> dByte) {
		if(dByte.isEmpty()) {
			System.out.println("La cola esta vacía");
		}
		for(Byte b : dByte){
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
