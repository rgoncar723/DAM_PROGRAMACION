package Ejercicios1_1Expresiones;


public class Ejercicio1 {

	public void exercise1() {
		
	
		
		int i = 3*5-4/2;
		System.out.println(i);
		int i2 = 7-4*2-5*2;
		System.out.println(i2);
		
		boolean b =  5+4<7+8;
		System.out.println(b);
		boolean b2= 4<5*4/2-7;
		System.out.println(b2);
		boolean b3 = !(4>6);
		System.out.println(b3);
		
	}
	
	
	public static void main(String[] args) {
		
		new Ejercicio1().exercise1(); 
	}

}
