package ejercicios13_3Optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	/*
	 * Crea una clase que tenga como atributo una lista de alumnos (de la clase
	 * Alumno del Ejercicio 5). Realiza el siguiente método:
	 * 
	 * Optional<Alumno> findRepeaterStudent(String nombre): busca en la lista de
	 * alumnos el alumno repetidor que coincide con el nombre del parámetro. Si el
	 * alumno no se encuentra en la base de datos o se encuentra pero no es
	 * repetidor, devuelve un Optional vacío.
	 * 
	 * Realiza un main que haga lo siguiente con el Optional:
	 * 
	 * Si tiene valor, que lo muestre por consola. Si no, que muestre el mensaje
	 * "Este alumno no existe en la BD o no es repetidor".
	 * 
	 * Si tiene valor, que le sume 1 a la nota y luego saque el alumno por consola.
	 * Si no, que lance la excepción IllegalStateException.
	 * 
	 * Si tiene valor, que se compruebe si está aprobado. Si está aprobado, que lo
	 * muestre por consola. Si no está aprobado o no tiene valor, que se lance la
	 * excepción NoSuchElementException.
	 */
	private List<Alumno> alumnos = new ArrayList<>();

	public void show() {
		Scanner kb = new Scanner(System.in);
		
		Alumno al;
		Optional<Alumno> opt = Optional.empty();
		int opcion = 0;
		
		alumnos.add(new Alumno ("Maria", 6.7,true));
		alumnos.add(new Alumno ("Luisa",3.4,false));
		alumnos.add(new Alumno ("Javier",7.8,true));
		alumnos.add(new Alumno ("Santiago",8.4,false));
		alumnos.add(new Alumno ("Sergio",4.2,true));
		alumnos.add(new Alumno ("Raquel",8.0,false));
		alumnos.add(new Alumno ("Sara",7.65,true));
		alumnos.add(new Alumno ("Esther",5.7,false));
		System.out.print("Introduce el nombre del alumno a buscar: ");
        String nombre = kb.nextLine();
        
  
        opt = findRepeaterStudent(nombre);
		
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Mostrar si existe y es repetidor");
            System.out.println("2. Sumar 1 a la nota (Lanza IllegalStateException si falla)");
            System.out.println("3. Comprobar si está aprobado (Lanza NoSuchElementException si falla)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = kb.nextInt();

            try {
                switch (opcion) {
                    case 1 -> opt.ifPresentOrElse(
                        System.out::println, 
                        () -> System.out.println("Este alumno no existe en la BD o no es repetidor")
                    );
                    
                    case 2 -> {
                        // orElseThrow devuelve el objeto si existe, si no, lanza la excepción
                        al = opt.orElseThrow(() -> new IllegalStateException("Este alumno no existe en la BD o no es repetidor"));
                        al.setMark(al.getMark() + 1);
                        System.out.println(al.toString());
                    }
                    
                    case 3 -> {
                        // Filtramos si el alumno existe Y está aprobado
                         al = opt.filter(a->a.getMark()>=5).
                        		 orElseThrow(() -> new NoSuchElementException("Alumno no encontrado o no aprobado"));
                        System.out.println(al.toString());
                    }
                    
                    case 4 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (opcion != 4);
}

	Optional<Alumno> findRepeaterStudent(String nombre) {
		for (Alumno a : alumnos) {
			if (a.getName().equals(nombre) && a.getRepetidor()) {
				return Optional.of(a);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		new Main().show();

	}

}


