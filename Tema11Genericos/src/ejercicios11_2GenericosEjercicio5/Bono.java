package ejercicios11_2GenericosEjercicio5;

public enum Bono {
	MINIMO("Mínimo"), NORMAL("Normal"), COMPLETO("Completo");
	private String description;
	Bono(String description) {
		this.description=description;
	}
	String getDescription() {
		return description;
	}
}