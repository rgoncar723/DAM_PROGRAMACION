package ejercicios7_3Interfaces;

public abstract class Person implements Validate {
	
	protected String name;
	protected boolean isValidate;
	
	public Person(String name) {
		isValidate=false;
		setName(name);
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public abstract String numberType();
	
	public String toString() {
		return String.format("%s, %s.", name, isValidate?"Sí valido":"No valido");
	}
	@Override
	public void validate() {
		if(!isValidate) {
			isValidate = true;
		}
	}
	

}
