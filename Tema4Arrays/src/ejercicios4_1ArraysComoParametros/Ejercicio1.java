package ejercicios4_1ArraysComoParametros;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void exercise1() {
		Scanner keyboard= new Scanner(System.in);
		int length, value;
		System.out.println("Escriba cuantos numeros desea multiplicar");
		length=keyboard.nextInt();
		int[] numbers=new int[length];
		for(int i=0;i<length;i++) {
			System.out.printf("Introduce el valor del dato %d\n", i+1);//Va preguntando segun la longitud del array.
			value=keyboard.nextInt();
			numbers[i]=value;//Va almacenandolos en el arrays
			
		}
		System.out.printf("El resultado del producto de sus numeros es %d",product(numbers));
	}
	public int product(int...numbers) {
		int product =1;
		for(int i=0;i<numbers.length;i++) {//Longitud del array, se va incrementando
			product *= numbers[i];//Multiplica el numbero según la posicion del array 
		}
		return product;
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}

}
