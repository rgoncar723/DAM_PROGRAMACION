package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio3 {
	public void exercise3() {
		int[] numbers = { 5, 3, 8, 4, 2 };
		System.out.printf("Array principal %s\n", Arrays.toString(numbers));
		
		System.out.printf("\nArray ordenado %s", Arrays.toString(bubbleNumbers(numbers)));
	}
	public int[] bubbleNumbers(int...numbers) {
		int temporalNumber;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1-i;j++) {//Para que no se comparen numeros que ya se han comparado antes
				if(numbers[j]>numbers[j+1]) {
					temporalNumber= numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temporalNumber;
				}
			}
			System.out.printf("\nCambio %d: %s\n",i+1,Arrays.toString(numbers));
		}
		return numbers;
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();

	}

}
