package ejercicios12_8Arboles;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Employee implements Comparable<Employee> {
	private Key key;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;

	public Employee(String name, Category category, LocalDate startDate, LocalDate endDate) {
		this.key = new Key(category);
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	private Employee(Employee employee) {
		this.key = employee.key;
		this.name = employee.name;
		this.startDate = employee.startDate;
		this.endDate = employee.endDate;
	}
	
	public String getName() {
		return name;
	}
	public Key getKey() {
		return key;
	}
	public Employee copy() {
		return new Employee(this);
	}

	@Override
	public int compareTo(Employee o) {
		int result = Long.compare(o.daysWorked(), daysWorked());
		if (result == 0) {
			result = (this.name).compareTo(o.name);
		}
		return result;
	}

	public long daysWorked() {
		if (endDate == null) {
			return ChronoUnit.DAYS.between(startDate, LocalDate.now());
		} else {
			return ChronoUnit.DAYS.between(startDate, endDate);
		}
	}

	@Override
	public String toString() {
		return String.format(
				"%-10s Nombre: %-10s Clave: %-4s Fecha alta: %-12s Fecha baja: %-12s Días en la empresa: %d",
				key.getCategory(), name, key, startDate.toString(), (endDate != null) ? endDate.toString() : "No tiene",
				(int) daysWorked());

	}

}
