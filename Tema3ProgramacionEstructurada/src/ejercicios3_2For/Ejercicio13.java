package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio13 {
	@SuppressWarnings("resource")
	public void exercise13() {
		Scanner keyboard = new Scanner(System.in);
		// Tablero con números de fila
		int rowBishop=4;
		int columnBishop=4;
		boolean isBlack;
		for (int row = 8; row >= 1; row--) {
			System.out.print(row + " "); // Número de fila
			//Tablero de ajedrez
			for (int column = 1; column <= 8; column++) {
				if(rowBishop==row && columnBishop==column) {
					System.out.print("A ");
				} else if(Math.abs(row-rowBishop)==Math.abs(column-columnBishop)) { //movimientos posivles del alfil
					System.out.print("X ");
				} else {
					isBlack=(row+column)%2==0;
					System.out.print(isBlack ? "□ ":"■ ");
				}
			}
			System.out.println();
		}

		// Números de columnas
		System.out.print("  "); // Espacio para alinear
		for (int col = 1; col <= 8; col++) {
			System.out.printf("%d ", col);
		} 
	}
	public static void main(String[] args) {
		new Ejercicio13().exercise13();
	}

}
