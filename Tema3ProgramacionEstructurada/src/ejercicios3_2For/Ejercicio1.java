package ejercicios3_2For;
import java.util.Random;
public class Ejercicio1 {
	public void exercise1() {
		/*
		 * Realiza un procedimiento que simule 20 lanzamientos de un dado.
		 */
		Random random = new Random();
		int i,j; //Numero de lanzamientos, Numero del dado
		for(i=1;i<=20;i++) {//Se ejecuta 20 veces: i = 0, 1, 2, ..., 19
			j = random.nextInt(6)+1;
			System.out.printf("Lanzamiento %d, numero del dado %d\n",i,j);
		}
		
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();	}

}
