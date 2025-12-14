package ejercicios5_3Constructores;

import java.util.Scanner;

public class Main3 {
	@SuppressWarnings("resource")
	public void show() {
		// Declaracion de variables y creacion de objeto
		int studentID, grade1, grade2;
		String name;

		Scanner keyboard = new Scanner(System.in);

		Student student;

		System.out.println("Introduzca su nombre");
		name = keyboard.nextLine();

		System.out.println("Introduzca su numero de matricula");
		studentID = keyboard.nextInt();

		System.out.print("Introduce la primera nota: ");
		grade1 = keyboard.nextInt();

		System.out.print("Introduce la segunda nota: ");
		grade2 = keyboard.nextInt();

		student = new Student(name, studentID);

		student.setGrades(grade1, grade2);

		System.out.println("Datos del alumno");

		System.out.println(student);

	}

	public static void main(String[] args) {
		new Main3().show();

	}

}
