package Ejercicios2_1Printf;
import static Ejercicios2_1Printf.Colors.*;
public class Ejercicio2 {
	public void exercise2() {
		System.out.printf("%s%s Colors %s%s Are pretty %s%s funny %s%n" ,PURPLE,WHITE_BACKGROUND,RED,BLACK_BACKGROUND,BLACK,CYAN_BACKGROUND,RESET);
	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();

	}

}
