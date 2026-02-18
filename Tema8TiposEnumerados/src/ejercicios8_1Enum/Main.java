package ejercicios8_1Enum;

public class Main {
	public void show() {
		String text = "       aprendiendo enums       ";

		for (BasicStringOperation op : BasicStringOperation.values()) {
			System.out.println(op.getDescription() + " \"" + op.apply(text) + "\"");
		}

		for (ExtendedStringOperation op : ExtendedStringOperation.values()) {
			System.out.println(op.getDescription() + " \"" + op.apply(text) + "\"");
		}

	}

	public static void main(String[] args) {
		new Main().show();

	}

}
