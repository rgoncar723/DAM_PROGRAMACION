package ejercicios12_4ColeccionSinDuplicados;


import java.util.*;

public class Main {
	void show() {
		/*
		 * Una academia quiere registrar a los alumnos que se han matriculado en un
		 * curso. De cada alumno se almacena su dni, nombre y apellidos. Realiza un
		 * programa que permita al usuario registrar alumnos. No se permiten duplicados:
		 * si un alumno ya está registrado (mismo dni), no se volverá a guardar.
		 * 
		 * A continuación, el programa debe mostrar todos los alumnos de dos maneras:
		 * 
		 * Sin orden garantizado.
		 * 
		 * Manteniendo el orden de inserción.
		 * 
		 * A continuación, el programa le solicita al usuario un dni de un alumno para
		 * eliminarlo de la academia. Vuelve a mostrar los datos de todos los alumnos
		 * para confirmar que efectivamente se ha eliminado.
		 */
		  Set<Alumno> set = new HashSet<>();
		  Set<Alumno> set2 = new LinkedHashSet<>();
		  Iterator<Alumno> it = set.iterator();
		  ConsoleInput ci = new ConsoleInput();
		  Alumno aux, aux2;
		  String dni;
		  set.add(new Alumno("123456789P","Maria","Martinez Mora"));
		  set.add(new Alumno("123444559W","Rafael","Rodriguez Roja"));
		  set.add(new Alumno("154322289D","Catalina","Carrillo Cortez"));
		  set.add(new Alumno("123456789P","Mharia","Martinez Mora"));
		  
		  for(Alumno a: set) {
			  System.out.println(a);
		  }
		  System.out.println("LinkedHashSet");
		  System.out.println();
		  
		  set2.add(new Alumno("123453489P","Maria","Martinez Mora"));
		  set2.add(new Alumno("123444559W","Rafael","Rodriguez Roja"));
		  set2.add(new Alumno("154322289D","Catalina","Carrillo Cortez"));
		  set2.add(new Alumno("123453489P","Maria","Martinez Mora"));
		  for(Alumno a: set2) {
			  System.out.println(a);
		  }
		
			System.out.println("Introduce el DNI que quieras borrar");
			dni = ci.readString();
			aux = new Alumno("","",dni);
			while (it.hasNext()) {
				aux2 = it.next();
				if (aux2.equals(aux)) {
					it.remove();
				}
			}
			
			System.out.println("Lista nueva");
			
			 for(Alumno a: set) {
				  System.out.println(a);
			  }
		
	}

	public static void main(String[] args) {
		new Main().show();
	}

}
