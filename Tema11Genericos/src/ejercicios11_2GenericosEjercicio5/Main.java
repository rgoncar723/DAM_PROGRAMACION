package ejercicios11_2GenericosEjercicio5;

public class Main {
	public void show() {
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
