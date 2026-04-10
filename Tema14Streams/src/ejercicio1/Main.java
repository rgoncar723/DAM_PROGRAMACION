package ejercicio1;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	/*
	 * Student: Representa un alumno. Dispone de los campos id (identificador,
	 * long), name (nombre, cadena), age (edad, entera), group (grupo clase,
	 * cadena), grant (cantidad de beca, entero), grades (notas, lista de objetos
	 * Grade).
	 * 
	 * Grade: Representa una nota. Dispone de los campos subject (nombre de la
	 * asignatura, cadena) y mark (nota en dicha asignatura, float).
	 * 
	 * Database: Representa la base de datos con la que trabajaremos. Dispondrá de
	 * un campo privado correspondiente a la lista de estudiantes. Además tendrá un
	 * método público denominado queryAllStudents() que retornará la lista de
	 * alumnos.
	 * 
	 * Inicializa la base de datos con los siguientes datos de los alumnos (en este
	 * orden):
	 * 
	 * id name age group grant grades 
	 * 1 Germán Ginés 23 1º CFGS DAM 2000 [PROGR, 8],[LM, 3] 
	 * 2 Baldomero 21 1º CFGS DAM 0 [PROGR, 5], [LM, 4] 
	 * 3 Ana Guerra 17 1º CFGM SMR 4000 [PROGR, 8] 
	 * Realiza en Java los métodos necesarios para mostrar
	 * por pantalla el resultado de las siguientes consultas, usando streams (y
	 * optionals cuando sea necesario).
	 */
	Database db = new Database();

	public void show() {
		db.addStudents(new Student((long) 1, "German Ginés", 23, "1º CFGS DAM", 2000,
				List.of(new Grade("PROGR", 8), new Grade("LM", 3))));
		db.addStudents(new Student((long) 2, "Baldomero", 21, "1º CFGS DAM", 0,
				List.of(new Grade("PROGR", 5), new Grade("LM", 4))));
		db.addStudents(new Student((long) 3, "Ana Guerra", 17, "1º CFGS SMR", 4000, List.of(new Grade("PROGR", 8))));
		db.queryAllStudents().forEach(System.out::println);
		// Metodos

		showLegalAgeStudentCount();

		System.out.println();
		showStudentNamesOrderAlphabetically();

		System.out.println();
		showFistTwoStudentsNames();

		System.out.println();
		showStudentsNamesExceptTheFirstOne();

		System.out.println();
		showStudentsNamesUntilFirstNotLegalAgeOne();

		System.out.println();
		showStudentsSinceFirstNotLegalAgeOne();

		System.out.println();
		showNumberOfSubjectsOfEachStudent();

		System.out.println();
		showStudentsGrantsAndSum();

		System.out.println();
		getStudentsOlderThan20();

		System.out.println();
		showYoungestStudentName();

		System.out.println();
		showOldestStudentOlderThan23();

		System.out.println();
		showStudentNamesWithCommasOrderedByAge();

		System.out.println();
		showStudentCountInEachGroup();

		System.out.println();
		showGrantSummary();

		System.out.println();
		showAreAnyStudentUnderLegalAge();

		System.out.println();
		showAllStudentHaveGrant();

		System.out.println();
		showFirstStudentWithoutGrant();

		System.out.println();
		showHowManyStudentWithOrWithoutGrant();

		System.out.println();
		showDifferentSubjectsOrderedAlphabetically();

		System.out.println();
		showNumberOfPassersStudentsOfEachSubject();

	}

	// Metodos
	// showLegalAgeStudentCount()
	// Mostrar los alumnos que sean mayores de edad:
	public void showLegalAgeStudentCount() {
		long count;
		count = db.queryAllStudents()
				.stream()
				.filter(n -> n.getAge() >= 18)
				.count();
		System.out.printf("Número de alumnos mayores de edad: %d\n", count);
	}

	// showStudentNamesOrderAlphabetically()
	// Mostrar los nombres de los alumnos ordenados alfabéticamente:
	public void showStudentNamesOrderAlphabetically() {
		System.out.println("Nombres de alumnos (orden alfabético):");
		db.queryAllStudents()
		.stream()
		.map(Student::getName)
		.sorted()
		.forEach(System.out::println);

	}

	// showFistTwoStudentsNames()
	// Mostrar los nombres de los dos primeros alumnos:
	public void showFistTwoStudentsNames() {
		System.out.println("Mostrar los nombres de los dos primeros alumnos:");
		db.queryAllStudents()
		.stream()
		.map(Student::getName)
		.sorted()
		.limit(2)
		.forEach(System.out::println);
	}

	// showStudentsNamesExceptTheFirstOne()
	// Mostrar los nombres de todos los alumnos menos del primero:
	public void showStudentsNamesExceptTheFirstOne() {
		System.out.println("Mostrar los nombres de todos los alumnos menos del primero:");
		db.queryAllStudents()
		.stream()
		.map(Student::getName)
		.skip(1)
		.forEach(System.out::println);
	}

	// showStudentsNamesUntilFirstNotLegalAgeOne()
	// Mostrar los nombres de todos los alumnos hasta que encuentre uno menor de
	// edad. Éste ya no lo mostrará:
	public void showStudentsNamesUntilFirstNotLegalAgeOne() {
		System.out.println("Nombres de alumnos (hasta que encontramos uno menor de edad):");
		db.queryAllStudents()
		.stream()
		.filter(n -> n.getAge() >= 18)
		.map(Student::getName)
		.forEach(System.out::println);
	}

	// showStudentsSinceFirstNotLegalAgeOne()
	// Mostrar los nombres de todos los alumnos desde que encontremos uno menor de
	// edad. Éste sí lo mostrará:
	public void showStudentsSinceFirstNotLegalAgeOne() {
		System.out.println("Nombres de alumnos (desde que encontramos uno menor de edad):");
		db.queryAllStudents()
		.stream()
		.filter(n -> n.getAge() < 18)
		.map(Student::getName)
		.forEach(System.out::println);
	}

	// showNumberOfSubjectsOfEachStudent()
	// Mostrar el número de asignaturas de las que está matriculado cada alumno:
	public void showNumberOfSubjectsOfEachStudent() {
		db.queryAllStudents()
		.stream()
		.forEach(n -> System.out.printf("%s: %d\n", n.getName(), n.getGrades().size()));
	}

	// showStudentsGrantsAndSum()
	// Mostrar la beca de cada alumno y además la suma de todas las becas:
	public void showStudentsGrantsAndSum() {
		int sum;
		sum = db.queryAllStudents()
				.stream()
				.peek(n -> System.out.printf("%s: %d\n", n.getName(), n.getGrant()))
				.mapToInt(Student::getGrant)
				.sum();
		System.out.printf("Suma de becas: %d\n", sum);
	}

	// getStudentsOlderThan20()
	// Mostrar una lista con los nombres de los alumnos mayores de 20 años:
	public void getStudentsOlderThan20() {
		List<String> names;
		names = db.queryAllStudents()
				.stream()
				.filter(n -> n.getAge() > 20)
				.map(Student::getName)
				.toList();
		System.out.println(names.toString());
	}

	// showYoungestStudentName()
	// Mostrar el nombre del alumno más joven:
	public void showYoungestStudentName() {
		Optional<Student> youngest;
		youngest = db.queryAllStudents()
				.stream()
				.min(Comparator.comparing(Student::getAge));
		System.out.println("Alumno más joven");
		youngest.ifPresentOrElse(n -> System.out.println(n.getName()), () -> System.out.println("No encontrado"));

	}

	// showOldestStudentOlderThan23()
	// Mostrar el nombre del alumno más veterano de entre los que tengan más de 23
	// años:
	public void showOldestStudentOlderThan23() {
		Optional<Student> oldest;
		oldest = db.queryAllStudents()
				.stream()
				.filter(n -> n.getAge() > 23)
				.max(Comparator.comparing(Student::getAge));
		System.out.println("Alumno más veterano mayor de 23:");
		oldest.ifPresentOrElse(n -> System.out.println(n.getName()), () -> System.out.println("No encontrado"));
	}

	// showStudentNamesWithCommasOrderedByAge()
	// Mostrar una cadena con los nombres de los alumnos separados por coma,
	// ordenados por su edad:
	public void showStudentNamesWithCommasOrderedByAge() {
		String names;
		names = db.queryAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getAge)).map(Student::getName)
				.collect(Collectors.joining(", "));
		System.out.printf("Alumnos: %s", names);

	}

	// showStudentCountInEachGroup()
	// Mostrar el número de alumnos de cada grupo-clase, ordenados por nombre del
	// grupo:
	public void showStudentCountInEachGroup() {
		System.out.println("Número de alumnos en cada grupo:");
		db.queryAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGroup, TreeMap::new, Collectors.counting()))
		.forEach((k, v) -> System.out.printf("%s: %s %s\n", k, v, v == 1 ? "alumno" : "alumnos"));
	}

	// showGrantSummary()
	// Mostrar la estadística de becas de los alumnos, es decir, la beca máxima, la
	// mínima y la media (haciendo todos los cálculos de una sola vez):
	public void showGrantSummary() {

		System.out.println("Estadística de becas:");
		IntSummaryStatistics summary = db.queryAllStudents()
				.stream()
				.collect(Collectors.summarizingInt(Student::getGrant));
		System.out.printf("Máxima: %d Mínima: %d Media: %.0f", summary.getMax(), summary.getMin(),
				summary.getAverage());
	}

	// showAreAnyStudentUnderLegalAge()
	// Mostrar si hay algún alumno menor de edad:
	public void showAreAnyStudentUnderLegalAge() {
		System.out.printf("¿Algún alumno menor de edad? %s\n",
				db.queryAllStudents()
				.stream()
				.anyMatch(t -> t.getAge() < 18) ? "Sí" : "No");

	}

	// showAllStudentHaveGrant()
	// Mostrar si todos los alumnos tienen beca:
	public void showAllStudentHaveGrant() {
		System.out.printf("¿Todos los alumnos tienen beca? %s\n",
				db.queryAllStudents()
				.stream()
				.allMatch(t -> t.getGrant() > 0) ? "Sí" : "No");
	}

	// showFirstStudentWithoutGrant()
	// Mostrar el nombre del primer alumno que no tenga beca (grant == 0):
	public void showFirstStudentWithoutGrant() {
		System.out.printf("Nombre del primer alumno sin beca: %s\n", db.queryAllStudents()
				.stream()
				.filter(n -> n.getGrant() == 0)
				.findFirst()
				.map(Student::getName)
				.orElse("No encontrado"));
	}

	// showHowManyStudentWithOrWithoutGrant()
	// Mostrar cuántos alumnos hay con beca y cuántos sin beca:
	public void showHowManyStudentWithOrWithoutGrant() {
		System.out.println("Alumnos con o sin beca:");
		db.queryAllStudents()
		.stream()
		.collect(Collectors.partitioningBy(s -> s.getGrant() == 0, Collectors.counting()))
		.forEach((k, v) -> System.out.printf("%s: %d\n", k ? "Sin beca" : "Con beca", v));
	}

	// showDifferentSubjectsOrderedAlphabetically()
	// Mostrar las asignaturas de las que hay algún alumno matriculado, ordenadas
	// alfabéticamente:
	public void showDifferentSubjectsOrderedAlphabetically() {
		System.out.println("Asignaturas:");
		db.queryAllStudents()
		.stream()
		.flatMap(s -> s.getGrades().stream())
		.map(Grade::getSubject)
		.distinct()
		.sorted()
		.forEach(System.out::println);

	}

	// showNumberOfPassersStudentsOfEachSubject()
	// Mostrar el número de alumnos aprobados en cada asignatura (mark >= 5)
	// ordenado por nombre de la asignatura:
	public void showNumberOfPassersStudentsOfEachSubject() {
		System.out.println("Número de aprobados por asignatura");
		db.queryAllStudents()
		.stream()
		.flatMap(s -> s.getGrades().stream())
		.collect(Collectors.groupingBy(Grade::getSubject, TreeMap::new,Collectors.filtering(g -> g.getMark() >= 5, Collectors.counting())))
		.forEach((k, v) -> System.out.printf("%s-%d %s\n", k, v, v == 1 ? "aprobado" : "aprobados"));
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
