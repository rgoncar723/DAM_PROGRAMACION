package Ejercicios1_4MetodosDeString;

public class Ejercicio15 {
	public void exercise15() {
		String s="""
				Hello 
				Hi
				Hey
				""";
		String s1=s.indent(3);
		String s2=s1.indent(-2);
		System.out.println(s2);
		
	}

	public static void main(String[] args) {
		new Ejercicio15().exercise15();

	}

}
