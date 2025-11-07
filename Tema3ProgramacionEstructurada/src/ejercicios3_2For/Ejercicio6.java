package ejercicios3_2For;

import java.util.Scanner;

public class Ejercicio6 {
    
    public int losingMyMind3(String s, char c) {
        int last = -1;
        int beginning = -1;
        int i;

        // Busca las apariciones
        for(i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                // Guarda la primera aparición
                if(beginning == -1) {
                    beginning = i;
                }
                last = i;
            }
        }

        // Valida que se encontraron al menos dos apariciones
        if(beginning == -1 || last == -1 || beginning == last) {
            return -1; // No hay al menos dos apariciones diferentes
        }
        
        return last - beginning - 1;
    }

    @SuppressWarnings("resource")
	public void exercise6() {
        /*
        * Realiza una función que reciba una cadena y un carácter
        * y devuelva el número de caracteres que hay entre la primera y
        * última aparición del carácter en la cadena.
        * No se pueden utilizar los métodos indexOf ni contains.
        */

        Scanner keyboard = new Scanner(System.in);
        String s;
        char c; // Cambiado de String a char

        System.out.println("Introduce una cadena: ");
        s = keyboard.nextLine(); 
        
        System.out.println("Introduce un carácter: ");
        String charInput = keyboard.next(); // Lee como String primero
        c = charInput.charAt(0); // Convierte a char

        int result = losingMyMind3(s, c);
        
        if(result == -1) {
            System.out.println("El carácter no aparece al menos dos veces en la cadena.");
        } else {
            System.out.println("Número de caracteres entre la primera y última aparición: " + result);
        }
        
       
    }

    public static void main(String[] args) {
        new Ejercicio6().exercise6();
    }
}