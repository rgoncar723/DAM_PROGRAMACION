package ejercicios6_1Excepciones;

public class Main {
	public void show() {

		try {
			// Creación correcta
			Product p1 = new Product();
			Product p2 = new Product(2, (byte) 10, 50.5);

			System.out.println("Productos creados correctamente:");
			System.out.println(p1);
			System.out.println(p2);

			// Modificar precio
			p2.setPrice(99.99);
			System.out.println("Precio actualizado del producto 2: " + p2.getPrice());

			// Disminuir Stock
			p2.disminuirStock((byte) 5);
			System.out.println("Stock tras disminuir: " + p2.getStock());

			// Cadena de creación
			System.out.println(p1.cadenaProducto()); // Producto 1
			System.out.println(p2.cadenaProducto()); // Producto 2

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Erores de Invariante

		// Error de modelo
		try {
			Product pErrorModelo = new Product(5000, (byte) 10, 20.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Error de stock
		try {
			Product pErrorStock = new Product(10, (byte) -3, 15.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Eror de precio
		try {
			Product pErrorPrecio = new Product(10, (byte) 5, -9.5);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new Main().show();
	}
}
