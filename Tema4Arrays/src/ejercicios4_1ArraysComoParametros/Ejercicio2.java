package ejercicios4_1ArraysComoParametros;

import java.util.Arrays;

public class Ejercicio2 {
	public void exercise2() {
		int[] numbers = {2,4,6,8,10,12,14,16,18,20,25,30,35,40};
		System.out.println(Arrays.toString(numbers));
		halfArrays(numbers);
		System.out.println(Arrays.toString(numbers));
		halfArrays(numbers);
		System.out.println(Arrays.toString(numbers));
		halfArrays(numbers);
		
	}
	public void halfArrays(int...numbers) {
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=numbers[i]/2;
		}
		
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
