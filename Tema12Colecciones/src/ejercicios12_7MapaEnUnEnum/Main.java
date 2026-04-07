package ejercicios12_7MapaEnUnEnum;

public class Main {
	public void show() {
		BasicStringOperation op = BasicStringOperation.fromSymbol('U');
		BasicStringOperation op2 = BasicStringOperation.fromSymbol('L');
		String resultado = op.apply("hola");
		System.out.println(resultado);
		String resultado2 = op2.apply("hola");
		System.out.println(resultado2);
		
	}

	public static void main(String[] args) {
		new Main().show();
	}

}
