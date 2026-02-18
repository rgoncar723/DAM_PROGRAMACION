package ejercicios11_1Genericos;

public class Main1 {
	public void show() {
		// Realiza una clase genérica Caja que pueda guardar un objeto de cualquier
		// tipo.
		// Realiza para dicha clase los métodos get y set.

		Caja<Integer> genInteger;
		Caja<Double> genDouble;
		Caja<String> genString;

		genInteger = new Caja<>(21082007);
		genDouble = new Caja<>(163.2);
		genString = new Caja<>("Hallo! Er ist mein Bruder.");
		
		// Show
		genInteger.show();
		genDouble.show();
		genString.show();

		// Get
		System.out.println("-------------");
		System.out.println(genInteger.getAttribute());
		System.out.println(genDouble.getAttribute());
		System.out.println(genString.getAttribute());

		// Set
		genInteger.setAttribute(1010841492);
		genDouble.setAttribute(180.7);
		genString.setAttribute("Er ist sehr klug und nett. Sie ist meine Schwester. Tschüss");
		
		// Show
		System.out.println("-------------");
		genInteger.show();
		genDouble.show();
		genString.show();

	}

	public static void main(String[] args) {
		new Main1().show();

	}

}
