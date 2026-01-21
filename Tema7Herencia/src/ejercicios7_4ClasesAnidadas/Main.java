package ejercicios7_4ClasesAnidadas;

public class Main {
	public void show() {
		Vehicle car = new Vehicle("Toyota", "Corolla");
		Vehicle SUV = new Vehicle ("Jeep","Wagoneer S");
		SUV.installEngine(0, "Full electric");
		car.installEngine(1600, "Gasoline");
        System.out.println(car);
        System.out.println(SUV);

	}

	public static void main(String[] args) {
		new Main().show();

	}

}
