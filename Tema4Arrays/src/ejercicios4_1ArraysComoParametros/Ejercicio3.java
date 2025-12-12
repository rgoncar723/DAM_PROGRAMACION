package ejercicios4_1ArraysComoParametros;

import java.util.Scanner;

public class Ejercicio3 {
	@SuppressWarnings("resource")
	public void exercise3() {
		int[] numbers;
		int length, value;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escriba la cantidad de numeros que desea sumar");
		length = keyboard.nextInt();
		numbers = new int[length];
		for (int i = 0; i < length; i++) {//Pedirle los datos al usuario
			System.out.printf("Escriba el valor numerico para el dato %d\n", i + 1);
			value = keyboard.nextInt();
			numbers[i]=value;//Importante poner el numbers[i] y despues el value, porque value puede ser 0 
		}
		System.out.printf("La suma de los valores recogidos son %d", addNumbers(numbers));

	}

	public int addNumbers(int... numbers) {
		int sumando = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumando += numbers[i];
		}
		return sumando;
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();

	}

}
