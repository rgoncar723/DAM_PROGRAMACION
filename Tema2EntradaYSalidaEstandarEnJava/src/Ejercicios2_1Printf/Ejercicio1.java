package Ejercicios2_1Printf;

public class Ejercicio1 {
	public void exercise1() {
		int x=10;
		int y=-10;
		float n=13.269834f;
		String cad="Ana";
		
		System.out.printf("%d\n%+d\n%d\n%.2f\n%10.4f\n%9.4f\n%+010.3f\nn=%.2fx=%d\n%10s%s%5s",x,x,y,n,n,n,n,n,x,cad,cad,cad);
		
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();

	}

}
