package ejercicios11_2GenericosEjercicio5;

public class Main {
	public void show() {
		/*
		 * Un club deportivo quiere permitir la entrada para personas que no sean socias
		 * y que quieran utilizar el club durante un día. La persona que quiera usar
		 * este servicio, tendrá que comprar un bono e indicar cuántas actividades va a
		 * realizar. Para ello, crea lo siguiente:
		 * 
		 * Enum llamado Bono con los siguientes valores: MINIMO, NORMAL, COMPLETO.
		 * 
		 * Clase genérica de tipo T llamada AccesoPuntual con:
		 * 
		 * Atributos:
		 * 
		 * bono: de tipo Enum Bono.
		 * 
		 * precio por actividad: de tipo T. T puede ser cualquier tipo numérico de Java.
		 * 
		 * número de actividades de tipo entero.
		 * 
		 * Métodos:
		 * 
		 * public double calcularPrecio() que calcule el precio en función del bono y
		 * del número de actividades que dicha persona va a realizar:
		 * 
		 * Bono MINIMO: el precio por actividad es la tercera parte del precio.
		 * 
		 * Bono NORMAL: el precio por actividad es la mitad del precio.
		 * 
		 * Bono COMPLETO: al precio por actividad se le resta el doble de la parte
		 * decimal del precio.
		 * 
		 * public String toString() que mostrará la información de la siguiente manera:
		 * 
		 * 
		 * 
		 * Realiza una clase Main que cree 6 objetos de la clase genérica AccesoPuntual:
		 * tres con Double y tres con Integer.
		 * 
		 * Objetos con Double: crea tres objetos con 5 actividades, 4.53 de precio por
		 * actividad y cada una con un tipo de bono distinto.
		 * 
		 * Objetos con Integer: crea tres objetos con 5 actividades, 4 de precio por
		 * actividad y cada una con un tipo de bono distinto.
		 * 
		 * Muestra los 6 objetos por consola. La salida debe ser exactamente igual a la
		 * siguiente:
		 */
		AccesoPuntual<Integer> maria;
		AccesoPuntual<Integer> pepe;
		AccesoPuntual<Integer> mario;
		AccesoPuntual<Double> pepa;
		AccesoPuntual<Double> carlos;
		AccesoPuntual<Double> carla;

		maria = new AccesoPuntual<>(4, Bono.MINIMO, 5);
		pepe = new AccesoPuntual<>(4, Bono.NORMAL, 5);
		mario = new AccesoPuntual<>(4, Bono.COMPLETO, 5);
		pepa = new AccesoPuntual<>(4.53, Bono.MINIMO, 5);
		carlos = new AccesoPuntual<>(4.53, Bono.NORMAL, 5);
		carla = new AccesoPuntual<>(4.53, Bono.COMPLETO, 5);
		
		System.out.println("Accesos puntuales con Integer:");
		System.out.println(maria.toString());
		System.out.println(pepe.toString());
		System.out.println(mario.toString());
		
		System.out.println("Acceso puntuales con Double");
		System.out.println(pepa.toString());
		System.out.println(carlos.toString());
		System.out.println(carla.toString());

	}

	public static void main(String[] args) {
		new Main().show();

	}

}
