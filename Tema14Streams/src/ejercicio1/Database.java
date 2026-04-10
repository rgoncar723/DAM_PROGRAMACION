package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Student> students;
	
	public Database() {
		students = new ArrayList<>();
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	public List<Student> queryAllStudents(){
		return students;
	}
}
