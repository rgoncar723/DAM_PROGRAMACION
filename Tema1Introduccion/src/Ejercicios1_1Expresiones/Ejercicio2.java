package Ejercicios1_1Expresiones;

public class Ejercicio2 {

	public void exercise2() {
		
		boolean a = true;
		boolean b =false;
		boolean c = true;
		
		boolean d = a && b  || a && c;
		System.out.println(d);
		boolean e = (a || ! b) && (! a || c);
		System.out.println(e);
		boolean f = a || b && c;
		System.out.println(f);
		boolean g = ! (a || b) && c;
		System.out.println(g);
	
		
	}
	
	public static void main(String[] args) {
		
		new Ejercicio2(). exercise2();

	}

}
