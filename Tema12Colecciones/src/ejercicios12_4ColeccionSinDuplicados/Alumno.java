package ejercicios12_4ColeccionSinDuplicados;

import java.util.Objects;

public class Alumno {
	private String dni;
	private String name;
	private String lastNames;

	Alumno(String dni, String name, String lastNames) {
		this.dni = dni;
		this.name = name;
		this.lastNames = lastNames;
	}

	// Get
	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public String getLastNames() {
		return lastNames;
	}

	@Override
	public String toString() {
		return String.format("DNI: %s\n Nombre: %s\n Apellidos: %s\n", dni, name, lastNames);
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Alumno)) {
			return false;
		}
		Alumno other = (Alumno) obj;
		if (dni == null) {
			if (other.dni != null) {
				return false;
			} else if (!dni.equals(other.dni)) {
				return false;
			}
			if (!name.equals(other.name)) {
				return false;
			}
		}
		return true;
	}
}
