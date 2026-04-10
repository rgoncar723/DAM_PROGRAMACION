package ejercicio1;

import java.util.List;

public class Student {
	private long id;
	private String name;
	private int age;
	private String group;
	private int grant;
	private List<Grade> grades;
	
	public Student (long id, String name,int age,String group, int grant,List<Grade>grades) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.group = group;
		this.grant=grant;
		this.grades=grades;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGroup() {
		return group;
	}
	public int getGrant() {
		return grant;
	}
	public List<Grade> getGrades(){
		return grades;
	}

	@Override
	public String toString() {
		return String.format("id: %d name: %-9s age: %d group: %-9s grant: %d grades: %-9s\n", id,name,age,group,grant,grades.toString());
	}
	
	
}
