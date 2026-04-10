package ejercicios13_1InterfacesPuras;

import java.util.HashMap;
import java.util.Map;



public class Ejercicio3 {
	/*
	 * Realiza el siguiente mapa:
	 * 
	 * Clave: nombre de empleados
	 * 
	 * Valor: sueldo de empleados
	 * 
	 * Para dicho mapa, realiza lo siguiente:
	 * 
	 * Muestra los datos del mapa utilizando el método forEach:
	 * 
	 * Empleado: Ana Sueldo: 2000,96 Empleado: Rodrigo Sueldo: 2500,74 Empleado:
	 * Juan Sueldo: 1000,45 Empleado: Antonio Sueldo: 3000,32 Empleado: Pepe Sueldo:
	 * 1500,58 Utilizando el método computeIfAbsent, introduce en el mapa a "Luis"
	 * con un sueldo base de 1000 euros:
	 * 
	 * Empleado: Luis Sueldo: 1000,00 Utilizando el método computeIfPresent, súbele
	 * el sueldo a "Luis" un 20%:
	 * 
	 * Empleado: Luis Sueldo: 1200,00 Utilizando el método replaceAll, súbele el
	 * sueldo a todos un 10%:
	 * 
	 * Empleado: Ana Sueldo: 2201,06 Empleado: Luis Sueldo: 1320,00 Empleado:
	 * Rodrigo Sueldo: 2750,81 Empleado: Juan Sueldo: 1100,50 Empleado: Antonio
	 * Sueldo: 3300,35 Empleado: Pepe Sueldo: 1650,64
	 */
	public void show() {
		Map<String,Double> employee = new HashMap<>();
		employee.put("Ana", 2000.96);
		employee.put("Rodrigo", 2500.74);
		employee.put("Juan", 1000.45);
		employee.put("Antonio", 3000.32);
		employee.put("Pepe", 1500.58);
		employee.forEach((n,s)->System.out.printf("Empleado: %-9s  Sueldo: %.2f\n",n,s));
		employee.computeIfAbsent("Luis", s -> 1000.00);
		
		employee.computeIfPresent("Luis", (s,i)->i*1.20);
		employee.replaceAll((n,s)->s*1.10);
		System.out.println("Despues de los cambios");
		employee.forEach((n,s)->System.out.printf("Empleado: %-9s  Sueldo: %.2f\n",n,s));

	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
