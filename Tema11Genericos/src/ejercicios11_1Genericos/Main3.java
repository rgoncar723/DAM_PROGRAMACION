package ejercicios11_1Genericos;

public class Main3 {
	public void show() {
		Pareja<Number, Double> genIntegerDouble;
		Pareja<Number, Integer> genIntegerInteger;
		Pareja<String, Number> genStringString;
		Pareja<Double, String> genDoubleString;
		Pareja<Integer, Double> genDoubleInteger;

		genIntegerDouble = new Pareja<>(2.1082007, 163.2);
		genIntegerInteger = new Pareja<>(21082007, 1010841392);
		genStringString = new Pareja<>("Hallo", 2323);
		genDoubleString = new Pareja<>(180.7, "Schwester");
		genDoubleInteger = new Pareja<>(1235, 4.54567);
		System.out.println("--------------------------");
		genIntegerDouble.mostrarTipos();
		genIntegerInteger.mostrarTipos();
		genStringString.mostrarTipos();
		genDoubleString.mostrarTipos();
		genDoubleInteger.mostrarTipos();
		System.out.println("--------------------------");
		System.out.println(genIntegerDouble.mismoTipo());//True
		System.out.println(genIntegerInteger.mismoTipo());//True
		System.out.println(genStringString.mismoTipo());//False
		System.out.println(genDoubleString.mismoTipo());//False
		System.out.println(genDoubleInteger.mismoTipo());//False

	}

	public static void main(String[] args) {
		new Main3().show();

	}

}
