package ejercicios7_2ClasesAbstractas;

public class Circle extends GeometricFigure {
	protected double radius;
	
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
	}
	@Override
	public double calculateArea() {
		return Math.PI * (radius*radius);
	}
	@Override
	public String toString() {
		return String.format("Circulo: %s\n", super.toString());
	}

}
