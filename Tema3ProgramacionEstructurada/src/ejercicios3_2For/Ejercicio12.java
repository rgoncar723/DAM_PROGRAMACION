package ejercicios3_2For;
import static ejercicios3_2For.Colors.*;
public class Ejercicio12 {
	public void exersice12() {
		
		 // Tablero con números de fila
	    for(int row = 8; row >= 1; row--) {
	        System.out.print(row + " "); // Número de fila
	        //Tablero de ajedrez
	        for(int column = 1; column <= 8; column++) {
	            if((column + row) % 2 == 0) {
	                System.out.print("■ ");
	            } else {
	                System.out.print("□ ");
	            }
	        }
	        System.out.println();
	    }
	    
	    // Números de columnas
	    System.out.print("  "); // Espacio para alinear
	    for(int col = 1; col <= 8; col++) {
	        System.out.printf("%d ", col);
	    }
	}

	public static void main(String[] args) {
		new Ejercicio12().exersice12();

	}

}
