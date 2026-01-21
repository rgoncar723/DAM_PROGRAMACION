package ejercicios7_1ConstructoresYVisibilidad;

public class Student2 extends Person2 {
	private boolean repetidor;

	// Constructor por defecto
	public Student2(String name, int age, String nationality, String gender, boolean repetidor) {
		//Llamar explícitamente al constructor del padre con super(...).
		super(name,age,nationality,gender);
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


