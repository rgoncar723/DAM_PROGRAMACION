package Ejercicios1_2Funciones;

public class Ejercicio1 {

	/*public int idk(int sum1, int sum2, boolean esSuma) {
		if (esSuma) {
			return sum1 + sum2;
		}
		else {
			return sum1 - sum2;
		}
	}*/ //We have not seen conditionals yet, but this is a way to do it.
	
	public int operation (int num1, int num2, boolean f) {
		return f ? num1 + num2: num1- num2 ;
	}
	
	public void exercise1 () {
	//Case 1	
	System.out.println(operation(6,9,true));
	System.out.println(operation(6,9,false));
	//Case 2
	int a, b;
	a = 23;
	b = 12;
	boolean f = true;
	System.out.println(operation(a,b,f));
	//Case 3
	System.out.println(operation(3 + 2, 4 * 2, (5 > 3)));
	System.out.println(operation(7 - 2, 12 / 3, (2 == 3)));
	
	}
	public static void main(String[] args) {
		
		new Ejercicio1().exercise1();
		

	}

}
