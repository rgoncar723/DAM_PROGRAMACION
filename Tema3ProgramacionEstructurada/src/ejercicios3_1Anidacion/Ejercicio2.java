package ejercicios3_1Anidacion;

public class Ejercicio2 {
	public String isItHot(double tempeture) {
		if (tempeture<0) {
			return"Hace mucho frio";
		}
		else if(tempeture>=0 && tempeture<15) {
			return"Hace frío";
		}
		else if(tempeture>=15 && tempeture<25) {
			return"Temperatura agradable";
		}
		else if(tempeture>=25 && tempeture<35) {
			return"Temperatura agradable";
		}
		else {
			return"Hace mucho calor";
		}
		
	}
	public void exercise2() {
		
		System.out.println(isItHot(0));
		System.out.println(isItHot(-2));
		System.out.println(isItHot(16));
		System.out.println(isItHot(26));
		System.out.println(isItHot(40));
		System.out.println(isItHot(35));
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
