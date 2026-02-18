package ejercicios11_1Genericos;

public class Pareja2<T , V extends T > {
	//Realiza la clase anterior con la restricción de que el segundo elemento pertenezca a una subclase del primero.


	private T attribute3;
	private V attribute4;
	
	public Pareja2(T attribute3, V attribute4) {
		this.attribute3=attribute3;
		this.attribute4=attribute4;
	}
	// Get
		public T getAttribute3() {
			return attribute3;
		}

		public V getAttribute4() {
			return attribute4;
		}

		public void mostrarTipos() {
			System.out.printf("%s y %s\n", attribute3.getClass().getName(), attribute4.getClass().getName());
		}

		public boolean mismoTipo() {
		    return attribute3.getClass().equals(attribute4.getClass());
		}
}
