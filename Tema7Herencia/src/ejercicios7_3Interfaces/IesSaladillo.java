package ejercicios7_3Interfaces;

public class IesSaladillo {
	public void show() {
		Person [] people = iesSaladillo();
		System.out.println("---- Metodo showOder -----");
		showOrder(people);
		System.out.println("---- Metodo showObjects -----");
		showObjects(people);
		System.out.println("---- Metodo processData -----");
		processData(people);

	}
	public Person[] iesSaladillo () {
		Person[] people = { new Student("Maria Espinosa"), new Student("Jose Valverde"), new Student("Juan Ruiz"),
				new Student("Pepe Perez"), new Student("Rosa Mancebo"), new Professor("Eva Rojas", 1500.00),
				new Professor("Ana Mijas", 1700.00), new Professor("Javier Cuevas", 1200.00)

		};
		return people;
	}

	public void showOrder(Person[] people) {
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].numberType());
		}
	}

	public void showObjects(Person[] people) {
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].toString());
		}
	}

	public void processData(Validate[] people) {
		
		//A nivel de comportamiento (Interfaces)
		double note;
		  for (int i = 0; i < people.length; i++) {
			people[i].validate();
			if (people[i] instanceof addNote addNote) {
				note=2.5;
				for (int j = 0; j < i; j++) {
					addNote.addNote(note);
					note += 2.5;
				}
				System.out.println(addNote);
			} else if (people[i] instanceof AumentoSalario salary) {

				salary.aumentoSalario(i * 10);
				System.out.println(salary);
			}
		}
			/*double note; A nivel de clase
			 * for (int i = 0; i < people.length; i++) {
				people[i].validate();
				if (people[i] instanceof Student s) {
					note=2.5;
					for (int j = 0; j < i; j++) {
						s.addNote(note);
						note += 2.5;
					}
					System.out.println(s);
				} else if (people[i] instanceof Professor p) {

					p.aumentoSalario(i * 10);
					System.out.println(p);
				}
			}*/

	}

	public static void main(String[] args) {
		new IesSaladillo().show();
	}

}
