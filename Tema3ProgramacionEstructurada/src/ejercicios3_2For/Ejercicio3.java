package ejercicios3_2For;


public class Ejercicio3 {
	public int losingMyMind2_0(int number1, int number2) {
		int add=0;
		int i;
		int result;
		for(i=0;i<number2;i++) {
			// Suma number1 en cada iteración
			add+=number1;//Toma el valor actual de add, luego le suma el number1 y asigna ese valor a result
	
		}
		result=add;
		return result;
	}
	public void exercise3() {
		
		System.out.println("5 X 4 = " + losingMyMind2_0(5,4)); //20
		System.out.println("4 X 4 = " + losingMyMind2_0(4,4)); //16
		System.out.println("5 X 0 = " + losingMyMind2_0(5,0)); //0
		System.out.println("4 X 5 = " + losingMyMind2_0(4,5)); //20
	}

	public static void main(String[] args) {
		new Ejercicio3().exercise3();

	}

}
