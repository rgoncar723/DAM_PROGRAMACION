package Ejercicios1_1Expresiones;

public class Ejercicio3 {
	
	public void exercise3( ) {
		
		
		int x =(int)165698L;
		System.out.println(x);
		short s = 56;
		byte b= (byte) s;
		System.out.println(b);
		byte byte2= (byte)129L;
		System.out.println(byte2);
		float f = 5.89f;
		System.out.println(f);
		long l = (long) 8.42;
		System.out.println(l);
		
		char c1= 'a', c2;
		
		c2 = (char) (c1 + 7);
		System.out.println(c1);
		System.out.println(c2);
		
		
		short short2 =7;
		boolean a= true;
		byte byte3 = (byte)(a ? short2++:--short2);
		System.out.println(byte3);
	
	
	}

	public static void main(String[] args) {
		 
		new Ejercicio3(). exercise3();

	}

}
