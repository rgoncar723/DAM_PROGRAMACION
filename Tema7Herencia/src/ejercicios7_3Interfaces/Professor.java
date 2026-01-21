package ejercicios7_3Interfaces;

public class Professor extends Person implements AumentoSalario {
	private static int counterProfessor = 0;
	private int count;
	private double salary;

	public Professor(String name, double salary) {
		super(name);
		setSalary(salary);
		counterProfessor++;
		count = counterProfessor ;

	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String numberType() {
		return "Soy el profesor número " + count;
	}

	@Override
	public double aumentoSalario(double percent) {

		salary += salary * (percent / 100);
		return salary;
	}
	@Override
	public String toString() {
		return String.format("Profesor %s Sueldo: %.2f", super.toString(),salary);
	}
}
