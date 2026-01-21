package ejercicios7_1ConstructoresYVisibilidad;

public class Person2 {
	//Clase Padre/ Superclase
	protected String name;
	protected int age;
	protected String nationality;
	protected String gender;
	//Constructor por defecto
	public Person2(String name, int age, String nationality, String gender) {
		this.name=name;
		this.age=age;
		this.nationality=nationality;
		this.gender=gender;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String nationality() {
		return nationality;
	}
	public String gender() {
		return gender;
	}
	public int age() {
		return age;
	}
	//Setters
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setNationality(String nationality) {
		this.nationality=nationality;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("Nombre: %s\n Edad: %d\n Nacionalidad: %s\n Sexo: %s\n", name,age,nationality,gender);
	}

}
