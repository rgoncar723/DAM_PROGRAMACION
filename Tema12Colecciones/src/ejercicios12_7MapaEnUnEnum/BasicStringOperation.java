package ejercicios12_7MapaEnUnEnum;

import java.util.Map;

public enum BasicStringOperation {
	/*
	 * En el enum BasicStringOperation del boletín de los enum, añadir un atributo
	 * carácter:
	 * 
	 * TO_LOWER: 'L'
	 * 
	 * TO_UPPER: 'U'
	 * 
	 * Añadir un método estático en el enum public static BasicStringOperation
	 * fromSymbol(char symbol) que reciba dicho atributo carácter y devuelva la
	 * instancia del enum correspondiente. Utiliza un mapa para implementarlo.
	 */
	TO_LOWER("Changing all characters into lower case:", 'L') {
		public String apply(String input) {
			return input.toLowerCase();
		}
	},
	TO_UPPER("Changing all characters into upper case:", 'U') {
		public String apply(String input) {
			return input.toUpperCase();
		}
	};

	private final String description;
	private final char symbol;
	private static final Map<Character, BasicStringOperation> map = Map.of(TO_LOWER.getSymbol(), TO_LOWER,
			TO_UPPER.getSymbol(), TO_UPPER);

	public abstract String apply(String input);

	public static BasicStringOperation fromSymbol(char symbol) {
		return map.get(symbol);
	}

	BasicStringOperation(String description, char symbol) {
		this.description = description;
		this.symbol = symbol;
	}

	public String getDescription() {
		return description;
	}

	public char getSymbol() {
		return symbol;
	}
}
