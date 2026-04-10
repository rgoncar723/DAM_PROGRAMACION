package ejercicios13_3Optional;



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
	public boolean getRepetidor() {
		return repetidor;
	}
	public String esRepetidor() {
		return repetidor ? "Si" : "No";
	}
	
	public void setMark(double mark) {
		this.mark=mark;
	}
	@Override
	public String toString() {
		return String.format("Nombre: %-9s Repetidor: %s Nota: %.2f", name,esRepetidor(),mark);
	}
	
}
