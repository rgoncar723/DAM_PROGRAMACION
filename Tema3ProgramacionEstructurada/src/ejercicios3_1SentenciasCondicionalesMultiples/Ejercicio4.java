package ejercicios3_1SentenciasCondicionalesMultiples;

public class Ejercicio4 {
	public void exercise4() {
		/*
		 * Realiza un procedimiento que saque una carta aleatoria de una baraja con 4
		 * palos y 13 cartas por cada palo. Los palos son Picas ♠, Corazones ♥,
		 * Diamantes ♦ y Tréboles ♣. Las 13 cartas por cada palo irán del as al diez y
		 * además tres figuras: jota, reina y rey. Mostrar la carta incluyendo el
		 * símbolo del palo(♠,♥,♦,♣)
		 */

		int palo = (int) (Math.random() * 4) + 1;// valor entre 1 y4
		int carta = (int) (Math.random() * 13) + 1; // valor entre 1 y 13
		String nombrePalo = "";
		String nombreCarta = ""; // Ponemos cadenas vacias para que Eclipse no ponga un error de que no se hayan
									// inicializado las variables.

		switch (palo) {
		case 1:
			nombrePalo = "♠";
			System.out.println(nombrePalo);// Para que muestre el simbolo y no el numero
			break;
		case 2:
			nombrePalo = "♥";
			System.out.println(nombrePalo);
			break;
		case 3:
			nombrePalo = "♦";
			System.out.println(nombrePalo);
			break;
		case 4:
			nombrePalo = "♣";
			System.out.println(nombrePalo);
			break;
		}

		if (carta == 1) {
			nombreCarta = "As";
			System.out.println(nombreCarta);// para que muestre la carta y no el numero
		} else if (carta == 11) {
			nombreCarta = "Jota";
			System.out.println(nombreCarta);
		} else if (carta == 12) {
			nombreCarta = "Reina";
			System.out.println(nombreCarta);
		} else if (carta == 13) {
			nombreCarta = "Rey";
			System.out.println(nombreCarta);
		} else {
			nombreCarta = String.valueOf(carta);
			System.out.println(carta);
		}
		System.out.println("Tu carta es " + nombreCarta + " de " + nombrePalo);
	}

	public static void main(String[] args) {
		new Ejercicio4().exercise4();
	}

}
