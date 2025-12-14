package ejercicios5_3Constructores;

public class Main2 {
	public void show() {
		//Creacion de objeto
		Person2 person = new Person2("Raquel","Estudiante","Leo",18,1.65f);
		//Salida por pantalla
		System.out.println(person);
	}

	public static void main(String[] args) {
		new Main2().show();

	}

}
