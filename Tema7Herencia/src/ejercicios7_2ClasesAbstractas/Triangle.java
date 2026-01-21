package ejercicios7_2ClasesAbstractas;

public class Triangle extends GeometricFigure {
	private double base;
	private double height;
	
	public Triangle(String color, double base, double height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	
	@Override
	public double calculateArea() {
		return (base*height)/2;
	}
	@Override
	public String toString() {
		return String.format("Triangulo: %s\n", super.toString());
	}

}
