package ejercicios5_3Constructores;

public class Student {
	private String name;
	private int studentID, grade1, grade2;
	
	public Student(String name, int studentID) {
		this.name=name;
		this.studentID=studentID;
	}
	
	//Get
	public String getName() {
		return name;
	}
	public int getStudentID() {
		return studentID;
	}
	public int getGrade1() {
		return grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	//Set
	public void setName(String name) {
		this.name=name;
	}
	public void setGrades(int grade1, int grade2) {
		this.grade1=grade1;
		this.grade2=grade2;
	}
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	//Metodo para devolver la media
	public double average() {
		double finalGrade=(double)(grade1+grade2)/2;
		return finalGrade;
	}
	@Override
	public String toString() {
		return String.format("\tNombre: %s\n Numero de matricula: %d\n Calificacion 1: %d\n Calificacion 2: %d\n Media: %.2f\n ",name,studentID,grade1,grade2,average());
	}
}
