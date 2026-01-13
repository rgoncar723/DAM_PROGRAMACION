package ejercicios5_5This;

public class Main2 {
	public void show() {
		Person person1 = new Person();
		Person person2 = new Person("Paquito","Administrador de ponis magicos",250,15.3,25009.90);
	
		System.out.println(person1.getSalary());
		person1.setSalary(4500);
		person2.addSalary(person1);
		System.out.println(person2.getSalary());
		System.out.println(person1.getSalary());
		person2.doubleSalary();
		System.out.println(person2.getSalary());
		
	}

	public static void main(String[] args) {
		new Main2().show();

	}

}
