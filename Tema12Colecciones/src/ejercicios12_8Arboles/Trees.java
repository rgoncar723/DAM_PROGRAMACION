package ejercicios12_8Arboles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Trees {
	/*
	 * Ejercicio 1 Una empresa nos ha contratado para hacer una aplicación en java
	 * para registrar a sus empleados. Los requisitos son los siguientes:
	 * 
	 * Enum Category:
	 * 
	 * 3 constantes: BOSS, MANAGER y EMPLOYEE.
	 * 
	 * Atributo code con los siguientes valores para cada constante:
	 * 
	 * BOSS: B
	 * 
	 * MANAGER: M
	 * 
	 * EMPLOYEE: E
	 * 
	 * Clase Key:
	 * 
	 * Atributos: enum Category y un número entero.
	 * 
	 * Constructor: Key(Category category)
	 * 
	 * El número de la clave será 1 para el primer jefe, primer encargado y primer
	 * empleado, 2 para los segundos, etc.
	 * 
	 * Método toString: devuelve una cadena concatenando el código del enum con el
	 * número entero. Ejemplo: B1
	 * 
	 * Clase Employee:
	 * 
	 * Atributos:
	 * 
	 * key: objeto de la clase Key.
	 * 
	 * name: nombre del empleado.
	 * 
	 * startDate: fecha de alta en la empresa.
	 * 
	 * endDate: fecha de baja en la empresa. Si continúan trabajando en la empresa,
	 * este atributo contendrá null.
	 * 
	 * Constructor: Employee(String name,Category category,LocalDate
	 * startDate,LocalDate endDate)
	 * 
	 * Para generar una copia de un empleado, crear un método public Employee copy()
	 * que utilice el siguiente constructor privado: private Employee(Employee
	 * employee).
	 * 
	 * Método long daysWorked(): devuelve los días que lleva el empleado trabajando
	 * en la empresa.
	 * 
	 * Método toString: devuelve los datos del empleado incluyendo los días que
	 * lleva trabajando en la empresa. Ejemplo de dos empleados, uno con fecha de
	 * baja y otro no:
	 * 
	 * 
	 * 
	 * Clase Trees: esta clase contendrá el main con 3 árboles de empleados:
	 * 
	 * En los 3 árboles se añadirán los siguientes empleados y en este mismo órden:
	 * 
	 * Orden de inserción en los árboles Nombre Categoría Fecha Alta Fecha Baja 1
	 * Pepe EMPLOYEE 21/03/2011 22/04/2023 2 Juan MANAGER 29/02/2012 No tiene 3
	 * María BOSS 30/04/2010 31/05/2014 4 Laura EMPLOYEE 30/12/2010 No tiene 5
	 * Esteban MANAGER 05/11/2010 20/02/2024 6 Pedro BOSS 16/08/2009 No tiene 7
	 * Yolanda EMPLOYEE 27/07/2012 01/10/2013 8 Nuria BOSS 31/08/2009 No tiene 9
	 * Antonio MANAGER 28/01/2011 14/05/2024 10 Copia de Pepe 11 Copia de Esteban 12
	 * Copia de Pedro Los 3 árboles son los siguientes:
	 * 
	 * Arbol con los empleados ordenados descendentemente por los días que llevan
	 * trabajando en la empresa. A igualdad de días, ordenar por orden alfabético
	 * del nombre. Utiliza la interfaz Comparable.
	 * 
	 * Arbol con los empleados ordenados descendentemente por orden alfabético de
	 * los nombres de los empleados. Utiliza la interfaz Comparator de manera
	 * anónima.
	 * 
	 * TreeMap con los empleados ordenados descendentemente por categoría
	 * profesional y a misma categoría, se ordena ascendentemente por número.
	 * Utilizar como clave del TreeMap el atributo clave del empleado. Utiliza la
	 * interfaz Comparable.
	 * 
	 * De todos los árboles hay que mostrar los datos. La salida por consola debe
	 * ser exactamente igual a la siguiente, excepto los días en la empresa que
	 * dependerá del día que se ejectute. Esta salida por consola se ha ejecutado el
	 * 7 de mayo de 2025:
	 */
	public void show() {
		SortedSet<Employee> tree1 = new TreeSet<>();
		TreeMap<Key, Employee> tree3 = new TreeMap<>();
		List<Employee> listemp = new ArrayList<>();
		Employee employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9;
		listemp.add(employee1 = new Employee("Pepe", Category.EMPLOYEE, LocalDate.of(2011, 03, 21),
				LocalDate.of(2023, 04, 22)));
		listemp.add(employee2 = new Employee("Juan", Category.MANAGER, LocalDate.of(2012, 02, 29), null));
		listemp.add(employee3 = new Employee("Maria", Category.BOSS, LocalDate.of(2010, 04, 30),
				LocalDate.of(2014, 05, 31)));
		listemp.add(employee4 = new Employee("Laura", Category.EMPLOYEE, LocalDate.of(2010, 12, 30), null));
		listemp.add(employee5 = new Employee("Esteban", Category.MANAGER, LocalDate.of(2010, 11, 05),
				LocalDate.of(2024, 02, 20)));
		listemp.add(employee6 = new Employee("Pedro", Category.BOSS, LocalDate.of(2009, 8, 16), null));
		listemp.add(employee7 = new Employee("Yolanda", Category.EMPLOYEE, LocalDate.of(2012, 7, 27),
				LocalDate.of(2013, 10, 1)));
		listemp.add(employee8 = new Employee("Nuria", Category.BOSS, LocalDate.of(2009, 8, 31), null));
		listemp.add(employee9 = new Employee("Antonio", Category.MANAGER, LocalDate.of(2011, 1, 28),
				LocalDate.of(2024, 05, 14)));
		listemp.add(employee1.copy());
		listemp.add(employee5.copy());
		listemp.add(employee6.copy());
		for (Employee e : listemp) {
			tree1.add(e);
		}
		System.out.printf("Arbol 1:\n\n");
		for (Employee e : tree1) {
			System.out.println(e);
			;
		}
		System.out.printf("\n\nArbol 2:\n\n");
		SortedSet<Employee> tree2 = new TreeSet<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int result = (o2.getName()).compareTo(o1.getName());
				return result;
			}
		});
		for (Employee e : listemp) {
			tree2.add(e);
		}
		for (Employee e2 : tree2) {
			System.out.println(e2);
		}
		System.out.printf("\n\nArbol 3:\n\n");
		for (Employee emp : listemp) {
			tree3.put(emp.getKey(), emp);
		}
		for (Map.Entry<Key, Employee> emp : tree3.entrySet()) {
			System.out.println(emp.getValue());
		}

	}

	public static void main(String[] args) {
		new Trees().show();

	}

}
