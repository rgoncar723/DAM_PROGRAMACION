package ejercicios11_2GenericosEjercicio5;

public class AccesoPuntual<T extends Number> {
	private T precio;
	private Bono bono;
	private int activities;

	public AccesoPuntual(T precio, Bono bono, int activities) {
		this.precio = precio;
		this.bono = bono;
		this.activities = activities;
	}

	public double calcularPrecio() {
		double total = 0.0;
		double precio = this.precio.doubleValue();
		int price = this.precio.intValue();
		int activities = this.activities;
		switch (bono) {
		case MINIMO -> total = (precio / 3) * activities;
		case NORMAL -> total = (precio / 2) * activities;
		case COMPLETO -> total = (precio - (precio - price) * 2) * activities;
		}
		;
		return total;
	}

	@Override
	public String toString() {
		return String.format("Bono: %s\tPrecio por actividad: %.2f  Número de actividades: %d   Precio total: %.2f",
				bono.getDescription(), precio.doubleValue(), activities, calcularPrecio());
	}
}
