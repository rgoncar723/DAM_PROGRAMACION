package ejercicios3_3Recursividad;

public class Ejercicio7 {
	public void exercise7() {
		Ejercicio7 obj = new Ejercicio7();
		obj.hanoiExample(3, 1, 2, 3);

	}

	public void hanoiExample(int number, int inicial, int auxiliar, int destiny) {
		if (number == 1) {
			System.out.println(inicial + "--->" + destiny);
		} else {
			hanoiExample(number - 1, inicial, destiny, auxiliar);
			System.out.println(inicial + "--->" + destiny);
			hanoiExample(number - 1, auxiliar, inicial, destiny);
		}
	}

	public static void main(String[] args) {
		new Ejercicio7().exercise7();
	}

}
