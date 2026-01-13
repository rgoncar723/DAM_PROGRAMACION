package ejercicios5_6Records;

	public record Producto(int id, String name, double price) {
		public Producto {
			if (id <= 0) {
				throw new IllegalArgumentException("Id must be positive");
			}
			if (price < 0) {
				throw new IllegalArgumentException("Price must be positive");
			}
			if (name.isBlank() || name == null) {
				throw new IllegalArgumentException("You have to wirte down a name for the product");
			}
		}

		public Producto aplicarDescuento(double discount) {
			double newPrice;
			if (discount < 0 || discount > 100) {
				throw new IllegalArgumentException("Discounts cannot be less than 0 or greater than 100 ");
			}
			newPrice = price - (price * discount / 100);

			return new Producto(id, name, newPrice);

		}
	}


