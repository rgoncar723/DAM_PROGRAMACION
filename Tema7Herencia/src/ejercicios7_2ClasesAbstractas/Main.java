package ejercicios7_2ClasesAbstractas;

public class Main {
	public void show() {
		Circle circle = new Circle("rojo",45.6);
		Triangle triangle = new Triangle ("Azul",12.0,45.6);
		Rectangle rectangle = new Rectangle ("Amarillo",200.0,120.0);
		
		circle.calculateArea();
		triangle.calculateArea();
		rectangle.calculateArea();
		
		System.out.println(circle);
		System.out.println(triangle);
		System.out.println(rectangle);
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
