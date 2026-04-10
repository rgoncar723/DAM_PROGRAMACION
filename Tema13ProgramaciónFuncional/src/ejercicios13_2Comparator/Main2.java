package ejercicios13_2Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	/*
	 * Crea una clase llamada Alumno con los siguientes atributos:
	 * 
	 * Nombre: de tipo String.
	 * 
	 * Repetidor: de tipo boolean.
	 * 
	 * Nota: de tipo double.
	 * 
	 * Crea varios alumnos. Ordénalos utilizando Comparator:
	 * 
	 * Ordénalos ascendentemente por nombre.
	 * 
	 * Ordénalos descendentemente por nombre y a igualdad de nombre,
	 * descendentemente por nota.
	 */
	public void show() {
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno ("Maria", 6.7,true));
		alumnos.add(new Alumno ("Luisa",3.4,false));
		alumnos.add(new Alumno ("Javier",7.8,true));
		alumnos.add(new Alumno ("Santiago",8.4,false));
		alumnos.add(new Alumno ("Sergio",4.2,true));
		alumnos.add(new Alumno ("Raquel",8.0,false));
		alumnos.add(new Alumno ("Sara",7.65,true));
		alumnos.add(new Alumno ("Esther",5.7,false));
		System.out.println("Ordenados ascendentemente por nombre");
		ascNombre(alumnos);
		System.out.println("Ordenados en orden descendente por nombre e igualdad de nombre, por nota");
		desNombreNota(alumnos);
	}
	public void ascNombre(List <Alumno> alumnos) {
		alumnos.sort(Comparator.comparing(Alumno::getName));
		alumnos.forEach(System.out::println);
	}
	public void desNombreNota(List<Alumno>alumnos) {
		alumnos.sort(Comparator.comparing(Alumno::getName).thenComparing(Alumno::getMark).reversed());
		alumnos.forEach(System.out::println);
		
	}

	public static void main(String[] args) {
		new Main2().show();

	}

}
