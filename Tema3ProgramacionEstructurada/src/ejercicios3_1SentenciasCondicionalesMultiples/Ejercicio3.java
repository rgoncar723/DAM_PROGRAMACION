package ejercicios3_1SentenciasCondicionalesMultiples;

public class Ejercicio3 {
	public String losingMyMind(int number1, int number2, int number3) {
		int largest, medium, lowest;
		if (number1 <= number2 && number1 <= number3) {
			lowest = number1;
			if (number2 <= number3) {
				medium = number2;
				largest = number3;
			} else {
				medium = number3;
				largest = number2;
			}
		} else if (number2 <= number1 && number2 <= number3) {
			lowest = number2;
			if (number1 <= number3) {
				medium = number1;
				largest = number3;
			} else {
				medium = number3;
				largest = number1;
			}
		} else {
			lowest = number3;
			if (number1 <= number2) {
				medium = number1;
				largest = number2;
			} else {
				medium = number2;
				largest = number1;
			}
		}
		return largest + " " + medium + " " + lowest + " ";
	}

	public void exercise3() {

		System.out.println(losingMyMind(4, 5, 9));// 9,5,4
		System.out.println(losingMyMind(8, 3, 0));// 8,3,0
		System.out.println(losingMyMind(2, 5, 1));// 5,2,1
		System.out.println(losingMyMind(6, 1, 9));// 9,6,1
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();
	}

}
