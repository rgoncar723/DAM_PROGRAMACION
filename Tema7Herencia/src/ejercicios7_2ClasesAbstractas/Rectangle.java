package ejercicios7_2ClasesAbstractas;

public class Rectangle extends GeometricFigure {
	
	protected double width;
	protected double height;
	
	public Rectangle(String color, double width, double height) {
		super(color);
		this.height=height;
		this.width=width;
	}
	@Override
	public double calculateArea() {
		return width * height;
	}
	@Override
	public String toString() {
		return String.format("Rectangulo: %s\n", super.toString());
	}
	

}
