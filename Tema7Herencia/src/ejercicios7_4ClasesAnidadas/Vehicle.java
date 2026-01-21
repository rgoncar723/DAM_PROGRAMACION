package ejercicios7_4ClasesAnidadas;

public class Vehicle {
	private String brand;
	private String model;
	private Engine engine;

	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	// Get
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	// Set
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Metodo para el motor
	public void installEngine(int displacement, String fuelType) {
		this.engine = new Engine(displacement, fuelType);// asigna ese nuevo motor al vehículo actual
	}

	@Override
	public String toString() {

		return String.format("%s, %s, Engine: %s", brand, model, engine.toString());

	}

	public Engine getEngine() {
		return engine;
	}

	private class Engine {
		private int displacement;
		private String fuelType;

		public Engine(int displacement, String fuelType) {
			this.displacement = displacement;
			this.fuelType = fuelType;
		}

		@Override
		public String toString() {
			return String.format(" %dcc, %s", displacement, fuelType);
		}
	}

}
