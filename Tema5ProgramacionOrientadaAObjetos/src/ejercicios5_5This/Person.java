package ejercicios5_5This;

public class Person {

	private int age;
	private String name;
	private double height;
	private String job;
	private double salary;
	//Constructor por defecto, sin parametros
	 public Person () {
	    	this("unnamed","unemployment",0,0.00f,0f);
	    }
	//this(parámetros) en alguno de sus constructores:
	public Person(String name, String job, int age, double height, double salary) {
		this.name=name;
		this.job=job;
		this.age=age;
		this.salary=salary;
		this.height=height;
	}
	//Get

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	//Set
	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	//String
	@Override
    public String toString() {
        return String.format("Nombre: %s\n Trabajo: %s\n Edad: %d\n Altura: %f\n Salario :%.2f", name,job,age,height,salary);
    }
	//addSalary
	//método addSalary que reciba una persona por parámetro. Dicho método tiene que incrementar el sueldo de la persona con el sueldo de la persona recibida como parámetro.
	public double addSalary(Person person) {
		salary+=person.salary;
		return salary;
		
	}
	//doubleSalary
	//método llamado doubleSalary que doble el sueldo utilizando el método addSalary y this.
	public void doubleSalary() {
		salary = addSalary(this);
	}
	

}
