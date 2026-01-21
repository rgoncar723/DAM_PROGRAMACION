package ejercicios6_1Excepciones;

public class Product {
	private int model;
	private byte stock;
	private double price;

	private static int counter = 0; // Atributo estatico para contar cuantos productos se han creado, ademas es
									// comun a todos los productos; se sabe cuantos productos existen en total
	private int numberCreation; // guarda el orden de los productos en concreto.
	// Constructor con parámetros

	public Product(int model, byte stock, double price) throws Exception {
		setModel(model);
		setStock(stock);
		setPrice(price);
		counter++;
		numberCreation = counter;

	}

	// Constructor por defecto que utilizando this(parametros inicialice los
	// atributos)
	public Product() throws Exception {
		this(1, (byte) 0, 0.0);

	}

	// Get
	int getModel() {
		return model;
	}

	byte getStock() {
		return stock;
	}

	double getPrice() {
		return price;
	}

	// Set
	public void setModel(int model) {
		// Invariante El modelo tiene que ser un número entre 1 y 1000.
		if (model < 1 || model > 1000) {
			throw new IllegalArgumentException("Error: model must be greater than 0 and less than 1000");
		}
		this.model = model;
	}

	public void setStock(byte stock) {

		if (stock >= 0) {
			this.stock = stock;
		} else {
			throw new IllegalArgumentException("Error: stock must not be negative. Value received: " + stock);
			
		}

	}

	public void setPrice(double price) throws Exception {
		if (price >= 0) {
			this.price = price;
		} else {
			throw new Exception("Error: price must be greater than 0");
			
		}

	}

	// ToString
	@Override
	public String toString() {
		return String.format("Modelo: %d\n Cantidad en Stock: %d\n Precio: %.2f\n", model, stock, price);
	}

	// Método para disminuir el stock que reciba por parámetro la cantidad a
	// disminuir.
	public void disminuirStock(byte newStock) {

		if (newStock < 0) {
			throw new IllegalArgumentException(
					"Error: The amount to decrease must be greater than 0. Received value:" + newStock);
		}
		if (newStock > stock) {
			throw new IllegalArgumentException(
					"Error: cannot decrease by " + newStock + " because the current stock is " + stock);
		} else {
			stock -= newStock;
		}

	}

	// Metodo que devuelva cadena
	public String cadenaProducto() {
		return "Soy el producto número: " + numberCreation;
	}
}
