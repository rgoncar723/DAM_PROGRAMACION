package ejercicios5_1Get_y_Set;

public class Person2 {
	// Copia la clase Person del ejercicio 1 y añádele los métodos que faltan para
	// poder consultar y modificar el valor de todos los atributos.

	private String name;
	private int age;
	private float height;
	private String work;

	// Get
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public String getWork() {
		return work;
	}
	// Set

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWork(String work) {
		this.work = work;
	}

}