package ejercicios12_4ColeccionSinDuplicados;

import java.util.*;

public class ConsoleInput {
	private Scanner kb;

	public ConsoleInput() {
		kb= new Scanner(System.in);
	}
    void cleanInput() {//Limpiar el buffer
    	kb.nextLine();
    }
    public int readInt() {//Leer un valor tipo entero
    	int numberInt=0;
    	boolean error;
    	do {
    		try {
        		
        		numberInt=kb.nextInt();
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
    	int numberInt = 0;
    	 do{
    		numberInt=readInt();
    		if(numberInt>=upperBound) {
    			System.out.printf("%sEl valor introducido : %d debe ser menor que %d.\n",numberInt,upperBound);
    		}
    	}while(numberInt>=upperBound);
    	 return numberInt;
    }
    public int readIntLessOrEqualThan(int upperBound) {//Leer un valor tipo entero <= parametro
    	int numberInt=0;
   	 do{
   		numberInt=readInt();
   		if(numberInt>upperBound) {
   			System.out.printf("El valor introducido : %d debe ser menor o igual que %d.\n",numberInt,upperBound);
   		}
   		
   	}while(numberInt>upperBound);
   	 return numberInt;
   }
    public int readIntGreaterThan(int lowerBound) {//Leer un entero > parametro
    	int numberInt=0;
    	do{
       		numberInt=readInt();
       		if(numberInt<=lowerBound) {
       			System.out.printf("El valor introducido : %d debe ser mayor que %d.%s\n",numberInt,lowerBound);
       		}
       		
       	}while(numberInt<=lowerBound);
       	 return numberInt;
    }
    public int readIntGreaterOrEqualThan(int lowerBound) {//Leer un entero >= parametro
    	int numberInt=0;
    	do{
       		numberInt=readInt();
       		if(numberInt<lowerBound) {
       			System.out.printf("El valor introducido : %d debe ser mayor o igual que %d.\n",numberInt,lowerBound);
       		}
       		
       	}while(numberInt<lowerBound);
       	 return numberInt;
    }
    public int readIntInRange(int lowerBound, int upperBound) {
    	int numberInt=0;
    	do {
    		System.out.printf("Introduce un valor un numero mayor a %d y menor a %d\n",lowerBound, upperBound);
    		numberInt=readInt();
    		if(numberInt < lowerBound || numberInt > upperBound) {
    			System.out.printf("El número debe estar comprendido entre %d y %d\n",lowerBound,upperBound);
    		}
    		
    	}while(numberInt < lowerBound || numberInt > upperBound);
    	return numberInt;
    }
    public double readDouble() {
    	double numberDouble=0.0;
    	boolean error;
    	do {
    		try {
        		numberDouble=kb.nextDouble();
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
    	double numberDouble=0.0;
    	do{
    		numberDouble=readDouble();
    		if(numberDouble>=upperBound) {
    			System.out.printf("El valor introducido : %f debe ser menor que %f.\n",numberDouble,upperBound);
    		}
    		
    	}while(numberDouble>=upperBound);
    	 return numberDouble;
    }
    public double readDoubleLessOrEqualThan(double upperBound) {//Leer un valor tipo decimal <= parametro
      	double numberDouble = 0.0; 
    	do{
      		numberDouble=readDouble();
    		if(numberDouble>upperBound) {
    			System.out.printf("El valor introducido : %f debe ser menor que %f.\n",numberDouble,upperBound);
    		}
    		
    	}while(numberDouble>upperBound);
    	 return numberDouble;

      }
    public double readDoubleGreaterThan(double lowerBound) {//Leer un entero > parametro
    	double numberDouble =0.0;
    	do{
       		numberDouble=readDouble();
       		if(numberDouble<=lowerBound) {
       			System.out.printf("El valor introducido : %f debe ser mayor que %f.\n",numberDouble,lowerBound);
       		}
       		
       	}while(numberDouble<=lowerBound);
       	 return numberDouble;
    }
    public double readDoubleGreaterOrEqualThan(double lowerBound) {//Leer un entero > parametro
    	double numberDouble=0.0;
    	do{
       		numberDouble=readDouble();
       		if(numberDouble<lowerBound) {
       			System.out.printf("El valor introducido : %f debe ser mayor que %f.\n",numberDouble,lowerBound);
       		}
       		
       	}while(numberDouble<lowerBound);
       	 return numberDouble;
    }
    public double readDoubleInRange(double lowerBound, double upperBound) {
    	double numberDouble=0.0;
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
    	String text;
    	text=kb.nextLine();
    	cleanInput();
    	return text;
    }
    public String readStringNotEmpty() {
    	String text;
    	boolean error = false;
    	do {
        	text=kb.nextLine();
        	if(text.trim().isEmpty()) {
        		System.out.println("No puedes ingreser una cadena de texto vacía. Tiene que al menos tener un caracter");
        		error=true;
        	}
    	}while(error);
    	
    	return text;
    }
    public String readString(int maxLength) {
    	String text;
    	boolean error = false;
    	do {
    		System.out.printf("Por favor ingrese una cadena de texto, con una longitudad máxima de %d caracteres",maxLength);
        	text=kb.nextLine();
        	if(text.length()>maxLength) {
        		System.out.println("La cadena de texto supera el número de caracteres permitidos.");
        		error=true;
        	}
        	cleanInput();
    	}while(error);
    	return text;
    }
    public char readChar() {
    	String text;
    	boolean error=true;
    	do {
    		text=kb.nextLine();
    		if(text.trim().length()==1) {
    			error=false;
    		}else {
    			System.out.println("Ha introducido más de un caracter.");
    		}
    	}while(error);
    	return text.trim().charAt(0);
    }
    public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
    	char input;
		boolean character;
		character = true;

		do {
			input = readChar();
			if (Character.toUpperCase(input) == Character.toUpperCase(affirmativeValue)) {
				character = true;
			} else if (Character.toUpperCase(input) == Character.toUpperCase(negativeValue)) {
				character = false;
			} else if (Character.toLowerCase(input) == Character.toLowerCase(affirmativeValue)) {
				character = true;
			} else if (Character.toLowerCase(input) == Character.toLowerCase(negativeValue)) {
				character = false;
			}
			else {
				System.out.printf("**Carácter inválido** Introduce %s o %s para continuar: ", affirmativeValue,
						negativeValue);
			}
		} while (input != affirmativeValue && input != negativeValue);
		return character;
	}
}
