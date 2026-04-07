package ejercicios12_5EnumSet;

import java.util.EnumSet;

public class Main {
	public void show() {
		/*
		 * Crea un EnumSet con los enum de los meses del año.
		 * 
		 * Crea un EnumSet de meses del año vacío. Introdúcele los meses de verano.
		 * 
		 * Crea un EnumSet a partir del anterior con todos los meses excepto los de
		 * verano.
		 * 
		 * Crea un EnumSet copia del anterior.
		 * 
		 * Crea un EnumSet con los meses de septiembre en adelante, es decir, hasta
		 * diciembre.
		 */
		EnumSet<Months> month1, month2, month3,month4,month5;
		//Crea un EnumSet con los enum de los meses del año.
		month1 = EnumSet.allOf(Months.class);
		System.out.printf("AllOf : \n%s\n",month1);
		//Crea un EnumSet de meses del año vacío. Introdúcele los meses de verano.
		month2 = EnumSet.noneOf(Months.class);
		month2.add(Months.JUNE);
		month2.add(Months.JULY);
		month2.add(Months.AUGUST);
		System.out.printf("Meses del verano: \n%s\n",month2);
		//Crea un EnumSet a partir del anterior con todos los meses excepto los de verano.
		month3 = EnumSet.complementOf(month2);
		System.out.printf("Todos los meses excepto el verano: \n%s\n",month3);
		//Crea un EnumSet copia del anterior.
		month4 = EnumSet.copyOf(month3);
		System.out.printf("Copia del anterior: \n%s\n",month4);
		//Crea un EnumSet con los meses de septiembre en adelante, es decir, hasta diciembre.
		month5 = EnumSet.range(Months.SEPTEMBER, Months.DECEMBER);
		System.out.printf("Desde septiembre en adelante: \n%s\n",month5);
		
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
