package ejercicios7_2ClasesAbstractas;

public abstract class GeometricFigure {
	protected String color;
	
	public GeometricFigure(String color) {
		this.color=color;
	}
	
	public abstract double calculateArea();
	
	@Override
	public String toString() {
		return String.format("Color: %s\n Area: %.2f\n", color, calculateArea());
	}
}
