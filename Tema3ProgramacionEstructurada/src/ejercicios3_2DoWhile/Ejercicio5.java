package ejercicios3_2DoWhile;

import java.util.Scanner;

public class Ejercicio5 {
	@SuppressWarnings("resource")
	public void exercise5() {
		int number;
		int index = 0, counter= 0;
		Scanner keyboard = new Scanner(System.in);
		 do {
			 System.out.println("Escriba un numero entre 0 y 10");
			 number = keyboard.nextInt();
			 if (number >=0 && number <=10) {
				 System.out.printf("El número introducido en la iteración %d es %d\n", index, number);
				 index++;
			if (number>=5) {
					 counter ++;
					 System.out.println("Aprobado");
				 } else  {
					 System.out.println("Suspendido");
				 }
			 } 
			 
			 else {
				 System.out.println("Nota invalida");
			 }
		 }while (number >= 0 && number <= 10); {
			 System.out.printf("En %d iteraciones se han introducido %d de los cuales aprobados son %d\n ", index, number, counter);  
         }
		
	}
	
	public static void main(String[] args) {
		new Ejercicio5().exercise5();

	}

}
