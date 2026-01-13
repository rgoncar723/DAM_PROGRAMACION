package ejercicios5_4Visibilidad;

public class Main {
	public void show() {
		Motorbike bike;
		bike= new Motorbike(2,"red");
		//getWheelCount es friendly y al estar en el mismo paquete se puede ver.
		System.out.printf("La moto tiene %d ruedas",bike.getWheelCount());
		//accelarete es public y se puede ver
		bike.accelarete(230);
		//Error de compilación: speed no es visible porque es private
        System.out.printf("\nLa moto es de color %s", bike.color);
		
	}

	public static void main(String[] args) {
	  new Main().show();
	}

}
