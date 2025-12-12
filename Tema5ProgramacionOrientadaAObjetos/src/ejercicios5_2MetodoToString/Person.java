package ejercicios5_2MetodoToString;

public class Person {
	private String name;
	private String job;
	private String starSign;
	private int age;
	private float height;
	//Get
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public String getStarSign() {
		return starSign;
	}
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}
	//Set
	public void setName(String name) {
		this.name=name;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setStarSign(String starSign) {
		this.starSign=starSign;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setHeight(float height) {
		this.height=height;
	}
	@Override
    public String toString() {
        return String.format("Nombre: %s\n Trabajo: %s\n Signo zodiacal: %s\n Edad: %d\n Altura: %f\n", name,job,starSign,age,height);
    }

}
