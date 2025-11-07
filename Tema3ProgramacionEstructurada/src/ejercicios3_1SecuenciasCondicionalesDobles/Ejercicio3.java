package ejercicios3_1SecuenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio3 {
	@SuppressWarnings("resource")
	public void exercise3() {
		/*
		 * Realiza un procedimiento que calcule y muestre el precio de un billete de ida
		 * y vuelta por avión, conociendo la distancia a recorrer, el número de días de
		 * estancia y sabiendo que si la distancia en total (entre ida y vuelta) es
		 * superior a 1.000 Km y el número de días de estancia es superior a 7, la línea
		 * aérea le hace un descuento del 30 %. El precio por kilómetro es de 0,35 €.
		 */
		int days;
		float distance;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Por favor escriba la distancia total de su vuelo: ");
		distance = keyboard.nextFloat();
		System.out.println("Por favor escriba su istancia: ");
		days = keyboard.nextInt();

		if (distance > 1000 && days > 7) {
			double costDistance = distance * (35.0 / 100.0);
			double finalCost = costDistance * (30.0 / 100.0);
			System.out.printf("Su precio de ida y vuelta sera de %.2f € disfrute su vuelo: ", finalCost);
		} else {
			double finalCost = distance * (35.0 / 100.0);
			System.out.printf("Su precio de ida y vuelta sera de %.2f € dsifrute su vuvelo: ", finalCost);
		}
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();
	}

}
