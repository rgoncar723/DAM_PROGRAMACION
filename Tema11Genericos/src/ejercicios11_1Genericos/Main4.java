package ejercicios11_1Genericos;

public class Main4 {
	public void show() {
		// Realiza una clase genérica OperaMate que tenga un elemento de cualquier tipo
		// numérico. Realiza los siguientes métodos:

		//Método recíproco para obtener el recíproco del número (se obtiene dividiendo 1 entre el número).

		//Método fracción para obtener la parte fraccionaria.
		OperaMate<Number> number1;
		OperaMate<Number> number2;
		OperaMate<Number> number3;
		OperaMate<Number> number4;
		
		number1 = new OperaMate<>(10);
		number2 = new OperaMate<>(12.34f);
		number3 = new OperaMate<>(23.45);
		number4 = new OperaMate<>(10L);
		System.out.println("-------------");
		System.out.println(number1.reciproco());
		System.out.println(number2.reciproco());
		System.out.println(number3.reciproco());
		System.out.println(number4.reciproco());
		System.out.println("--------------");
		System.out.println(number1.fraccion());
		System.out.println(number2.fraccion());
		System.out.println(number3.fraccion());
		System.out.println(number4.fraccion());
		
		
	}

	public static void main(String[] args) {
		new Main4().show();
	}

}
