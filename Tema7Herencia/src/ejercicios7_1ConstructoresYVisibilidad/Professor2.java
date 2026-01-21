package ejercicios7_1ConstructoresYVisibilidad;

public class Professor2 extends Person2 {

	private double salary;
	
	//Constructor
	public Professor2(String name, int age, String nationality, String gender, double salary) {
		super(name ,age ,nationality , gender);
		salary=0.0;
	}

	// Getters
	public double getSalary() {
		return salary;
	}

	// Setters
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString
	public String toString() {
		return String.format("%s Sueldo: %.2f\n", super.toString(), salary);
	}

}

