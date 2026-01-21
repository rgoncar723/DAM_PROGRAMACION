package ejercicios7_1ConstructoresYVisibilidad;

public class Student extends Person {

	private boolean repetidor;

	// Constructor por defecto
	public Student() {
		repetidor=false;
	}
	// Getters
	public boolean isRepetidor() {
		return repetidor;
	}

	// Setters
	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	// toString
	public String toString() {
		return String.format("%s Es repetidor : %b\n", super.toString(), repetidor);
	}

}
