package ejercicios7_3Interfaces;

public class Student extends Person implements Validate, addNote {

	private double[] notes = new double[3];
	private static int counterStudents = 0;
	private int counterNotes = 0;
	private int count;

	public Student(String name) {
		super(name);
		counterStudents++;
		count = counterStudents;
	}

	// notesCount indica cuántas notas hay
	// Si ya hay 3 → no entra en el if
	// Se guarda la nota en la posición correcta
	// Se incrementa el contador
	@Override
	public void addNote(double note) {
		if (counterNotes < notes.length) {
			notes[counterNotes] = note;
			counterNotes++;
		}
	}

	@Override
	public String numberType() {
		return "Soy el estudiante número: " + count;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("Alumno %s, ", super.toString()));
		if (count > 1) {
			sb.append("   \nNotas:\n");
			for (int i = 0; i < notes.length; i++) {

				if (notes[i] != 0) {

					sb.append(String.format("    Nota %d: %.2f\n", i + 1, notes[i]));
				}
			}
		}
		return sb.toString();
	}

}
