package ejercicios11_1Genericos;

public class Main2 {
	public void show() {
		Pareja<Integer, Double> genIntegerDouble;
		Pareja<Integer, Integer> genIntegerInteger;
		Pareja<String, String> genStringString;
		Pareja<Double, String> genDoubleString;
		Pareja<Double, Integer> genDoubleInteger;

		genIntegerDouble = new Pareja<>(21082007, 163.2);
		genIntegerInteger = new Pareja<>(21082007, 1010841392);
		genStringString = new Pareja<>("Hallo", "Tschüss");
		genDoubleString = new Pareja<>(180.7, "Schwester");
		genDoubleInteger = new Pareja<>(123.5, 454567);
		System.out.println("--------------------------");
		genIntegerDouble.mostrarTipos();
		genIntegerInteger.mostrarTipos();
		genStringString.mostrarTipos();
		genDoubleString.mostrarTipos();
		genDoubleInteger.mostrarTipos();
		System.out.println("--------------------------");
		System.out.println(genIntegerDouble.mismoTipo());
		System.out.println(genIntegerInteger.mismoTipo());
		System.out.println(genStringString.mismoTipo());
		System.out.println(genDoubleString.mismoTipo());
		System.out.println(genDoubleInteger.mismoTipo());

	}

	public static void main(String[] args) {
		new Main2().show();

	}

}
