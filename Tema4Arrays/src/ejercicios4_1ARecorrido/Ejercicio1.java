package ejercicios4_1ARecorrido;

public class Ejercicio1 {
	public void exercise1() {
		String s;
		int i;
		int[] numbers= {0,1,2,3,4,5,6,7,8,9};		
		for (i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				s ="par";
				System.out.printf("Posición %d: %s\n",i,s);
			}else {
				s="impar";
				System.out.printf("Posición %d: %s\n",i,s);
			}
			
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}

}
