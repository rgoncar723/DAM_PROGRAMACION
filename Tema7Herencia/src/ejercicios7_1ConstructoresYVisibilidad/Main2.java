package ejercicios7_1ConstructoresYVisibilidad;

import java.util.Scanner;

public class Main2 {
	@SuppressWarnings("resource")
	public void show() {
		Professor2 profesor = new Professor2("null",0,"NoNationality","?",0.0);
		Student2 estudiante = new Student2("null",0,"NoNationality","?",true);
		Person2 persona;
		int value;
		Scanner keyboard = new Scanner(System.in);
		//mostrar por con sola profesor y estudiante
		System.out.println(profesor);
		System.out.println(estudiante);
		System.out.println("--------------------");
		System.out.println("Por favor escriba 1 o 2 para ver un estudiante o un profesor respectivamente");
		value= keyboard.nextInt();
		if(value==1) {
			persona = new Student2("null",0,"NoNationality","?",true);
			System.out.println(persona);
		} else if(value ==2) {
			persona = new Professor2("null",0,"NoNationality","?",0.0);
			System.out.println(persona);
		}else{
			System.out.println("No ha introducido el numero correcto");
		}
		
	}

	

	public static void main(String[] args) {
		new Main().show();

	}

}
