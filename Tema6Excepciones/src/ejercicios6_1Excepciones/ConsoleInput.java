package ejercicios6_1Excepciones;

import java.util.*;

public class ConsoleInput {
	private Scanner keyboard;
	private boolean error=false;
	private int numberInt=0;
	private double numberDouble=0.0;
	private String text = " ";
	private char character=' ';
	

    public ConsoleInput(Scanner keyboard) {
        this.keyboard = keyboard;
    }
    private void cleanInput() {//Limpiar el buffer
    	keyboard.nextLine();
    }
    public int readInt() {//Leer un valor tipo entero
    	do {
    		try {
        		System.out.println(" Ingrese un número de acuerdo a las indicaciones mencionadas anteriormente");
        		numberInt=keyboard.nextInt();
        		error=false;
        	}catch(InputMismatchException e) {
        		System.out.printf("%s. El valor debe ser tipo número y respetar el rango comprendido %d a %d.%s\n","\u001B[31m",Integer.MIN_VALUE,Integer.MAX_VALUE);
        		error=true;
        	}finally {
        		cleanInput();
        	}
    	}while(error);
    	return numberInt;
    	
    }
    public int readIntLessThan(int upperBound) {//Leer un valor tipo entero < parametro
    	 do{
    		numberInt=readInt();
    		if(numberInt>=upperBound) {
    			System.out.printf("%sEl valor introducido : %d debe ser menor que %d.\n",numberInt,upperBound);
    		}
    	}while(numberInt>=upperBound);
    	 return numberInt;
    }
    public int readIntLessOrEqualThan(int upperBound) {//Leer un valor tipo entero <= parametro
   	 do{
   		numberInt=readInt();
   		if(numberInt>upperBound) {
   			System.out.printf("El valor introducido : %d debe ser menor o igual que %d.\n",numberInt,upperBound);
   		}
   		
   	}while(numberInt>upperBound);
   	 return numberInt;
   }
    public int readIntGreaterThan(int lowerBound) {//Leer un entero > parametro
    	do{
       		numberInt=readInt();
       		if(numberInt<=lowerBound) {
       			System.out.printf("El valor introducido : %d debe ser mayor que %d.%s\n",numberInt,lowerBound);
       		}
       		
       	}while(numberInt<=lowerBound);
       	 return numberInt;
    }
    public int readIntGreaterOrEqualThan(int lowerBound) {//Leer un entero >= parametro
    	do{
       		numberInt=readInt();
       		if(numberInt<lowerBound) {
       			System.out.printf("El valor introducido : %d debe ser mayor o igual que %d.\n",numberInt,lowerBound);
       		}
       		
       	}while(numberInt<lowerBound);
       	 return numberInt;
    }
    public int readIntInRange(int lowerBound, int upperBound) {
    	do {
    		System.out.printf("Introduce un valor un numero mayor a %d y menor a %d",lowerBound, upperBound);
    		numberInt=readInt();
    		if(numberInt < lowerBound || numberInt > upperBound) {
    			System.out.printf("El número debe estar comprendido entre %d y %d",lowerBound,upperBound);
    		}
    		
    	}while(numberInt < lowerBound || numberInt > upperBound);
    	return numberInt;
    }
    public double readDouble() {
    	do {
    		try {
        		System.out.println("Ingrese un número decimal de acuerdo a las indicaciones mencionadas anteriormente");
        		numberDouble=keyboard.nextDouble();
        		error=false;
        	}catch(InputMismatchException e) {
        		System.out.printf("El valor debe ser tipo número y respetar el rango comprendido %f a %f.\n",Double.MIN_VALUE,Double.MAX_VALUE);
        		error=true;
        	}finally {
        		cleanInput();
        	}
    	}while(error);
    	return numberDouble;
    }
    public double readDoubleLessThan(double upperBound) {
    	do{
    		numberDouble=readDouble();
    		if(numberDouble>=upperBound) {
    			System.out.printf("El valor introducido : %f debe ser menor que %f.\n",numberDouble,upperBound);
    		}
    		
    	}while(numberDouble>=upperBound);
    	 return numberDouble;
    }
    public double readDoubleLessOrEqualThan(double upperBound) {//Leer un valor tipo decimal <= parametro
      	 do{
      		numberDouble=readDouble();
    		if(numberDouble>upperBound) {
    			System.out.printf("El valor introducido : %f debe ser menor que %f.\n",numberDouble,upperBound);
    		}
    		
    	}while(numberDouble>upperBound);
    	 return numberDouble;

      }
    public double readDoubleGreaterThan(double lowerBound) {//Leer un entero > parametro
    	do{
       		numberDouble=readDouble();
       		if(numberDouble<=lowerBound) {
       			System.out.printf("El valor introducido : %f debe ser mayor que %f.\n",numberDouble,lowerBound);
       		}
       		
       	}while(numberDouble<=lowerBound);
       	 return numberDouble;
    }
    public double readDoubleGreaterOrEqualThan(double lowerBound) {//Leer un entero > parametro
    	do{
       		numberDouble=readDouble();
       		if(numberDouble<lowerBound) {
       			System.out.printf("El valor introducido : %f debe ser mayor que %f.\n",numberDouble,lowerBound);
       		}
       		
       	}while(numberDouble<lowerBound);
       	 return numberDouble;
    }
    public double readDoubleInRange(double lowerBound, double upperBound) {
    	do {
    		System.out.printf("Introduce un valor un numero mayor a %f y menor a %f",lowerBound, upperBound);
    		numberDouble=readDouble();
    		if(numberDouble < lowerBound || numberDouble > upperBound) {
    			System.out.printf("El número debe estar comprendido entre %f y %f",lowerBound,upperBound);
    		}
    		
    	}while(numberDouble < lowerBound || numberDouble > upperBound);
    	return numberDouble;
    }
    public String readString() {
    	System.out.println("Por favor ingrese una cadena de texto");
    	text=keyboard.nextLine();
    	cleanInput();
    	return text;
    }
    public String readStringNotEmpty() {
    	do {
    		System.out.println("Por favor ingrese una cadena de texto");
        	text=keyboard.nextLine();
        	if(text.trim().isEmpty()) {
        		System.out.println("No puedes ingreser una cadena de texto vacía. Tiene que al menos tener un caracter");
        		error=true;
        	}
    	}while(error);
    	
    	return text;
    }
    public String readString(int maxLength) {
    	do {
    		System.out.printf("Por favor ingrese una cadena de texto, con una longitudad máxima de %d caracteres",maxLength);
        	text=keyboard.nextLine();
        	if(text.length()>maxLength) {
        		System.out.println("La cadena de texto supera el número de caracteres permitidos.");
        		error=true;
        	}
        	cleanInput();
    	}while(error);
    	return text;
    }
    public char readChar() {
    	do {
    		System.out.println("Por favor. Introduzca unicamente un caracter");
    		text=keyboard.nextLine();
    		if(text.trim().length()==1) {
    			error=false;
    		}else {
    			System.out.println("Ha introducido más de un caracter.");
    		}
    		cleanInput();
    	}while(error);
    	return text.trim().charAt(0);
    }
    public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
    	do {
    		character=readChar();
    		 Character.toLowerCase(character);
    		if(character!= affirmativeValue|| character!=negativeValue) {
    			System.out.printf("Debes introducir %c para verdadero o %c para falso.",affirmativeValue,negativeValue);
    			error=true;
    		}
    	}while(error);
    	if(character==affirmativeValue) {
        	return true;
        }else {
        	return false;
        }
    }
}
