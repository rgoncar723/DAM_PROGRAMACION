package ejercicios13_2Comparator;

public class Alumno {
	private String name;
	private boolean repetidor;
	private double mark;
	
	public Alumno (String name, double mark,boolean repetidor) {
		this.name=name;
		this.mark=mark;
		this.repetidor=repetidor;
	}
	//get y set
	public String getName() {
		return name;
	}
	public double getMark() {
		return mark;
	}
	public String esRepetidor() {
		return repetidor ? "Si" : "No";
	}
	@Override
	public String toString() {
		return String.format("Nombre: %-9s Repetidor: %s Nota: %.2f", name,esRepetidor(),mark);
	}
}
