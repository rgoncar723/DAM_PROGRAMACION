package ejercicios3_1SentenciasCondicionalesMultiples;

public class Ejercicio2 {
	public String isItEquals(Integer number1, Integer number2, Integer number3) {
		if (number1.equals(number2) && number2.equals(number3)) {
			return "Hay tres numero iguales a " + number2;
		} else if (number1.equals(number2) || number1.equals(number3)) {
			return "Hay dos numeros iguales a " + number1;
		} else if (number2.equals(number3)) {
			return "Hay dos numeros iguales a " + number2;
		} else {
			return "No hay numeros iguales";
		}
	}

	public void exercise2() {
		System.out.println(isItEquals(0, 4, 4));
		System.out.println(isItEquals(4, 4, 4));
		System.out.println(isItEquals(4, 8, 4));
		System.out.println(isItEquals(0, 4, 9));

	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}

}
