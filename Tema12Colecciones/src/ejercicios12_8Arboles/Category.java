package ejercicios12_8Arboles;

public enum Category {
	BOSS('B'), MANAGER('M'),EMPLOYEE('E');
	private char symbol;

	Category(char c) {
		 this.symbol=c; 
	}
	public char getSymbol() {
		return symbol;
	}
}
