package ejercicio1;

public class Grade {
	private String subject;
	private float mark;
	
	public Grade(String subject, float mark) {
		this.subject=subject;
		this.mark=mark;
	}
	public String getSubject() {
		return subject;
	}
	public float getMark() {
		return mark;
	}
	@Override
	public String toString() {
		return String.format("[%s,%.0f]", subject,mark) ;
	}
	
}
