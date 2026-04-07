package ejercicios12_8Arboles;

import java.util.HashMap;
import java.util.Map;

public class Key implements Comparable<Key> {
	private Category category;
	private int number;
	private static Map<Category,Integer> counter = new HashMap<>();
	
	public Key(Category category) {
		this.category=category;
		this.number=numberCategory();
	}
	public int numberCategory () {
		int current;
		current = counter.getOrDefault(category, 0);
		current ++;
		counter.put(category, current);
		return current;
	}
	public Category getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return String.format("%c%d", category.getSymbol(),number);
	}
	@Override
	public int compareTo(Key o) {
		int result = category.compareTo(o.category);
		if(result ==0) {
			result = Integer.compare(number, o.number);
		}
		return result;
	}

}
