package Ejercicios1_3String;

public class Ejercicio1 {
	
	public void exercise1() {
		
		//ExampleCharAt Returns the character at the specified index (0-based).
		String text = "Hello";
        System.out.println("charAt(1) = " + text.charAt(1)); // 'e'
        //ExampleLenght Returns the length of the string.
        String text1 = "Hello";
        System.out.println("length = " + text1.length()); // 5
        //ExampleConcat Concatenates the specified string to the end of the current string.
        String a = "Hello ";
        String b = "World";
        System.out.println(a.concat(b)); // Hello World
        //ExampleEndsWith Tests if this string ends with the specified suffix.
        String text2 = "programming";
        System.out.println(text2.endsWith("ing")); // true
        System.out.println(text2.endsWith("pro")); // false
        //ExampleIndexOfChar Returns the index of the first occurrence of the character.
        String text3 = "banana";
        System.out.println(text3.indexOf('a')); // 1
        //ExampleIndexOfCharFrom Returns the index of the first occurrence of the character, starting the search at the given index.
        String text4 = "banana";
        System.out.println(text4.indexOf('a', 2)); // 3
        //ExampleIndexOfString Returns the index of the first occurrence of the substring.
        String text5 = "Hello World";
        System.out.println(text5.indexOf("World")); // 6
        //ExampleIndexOfStringFrom Returns the index of the substring, starting at the specified index.
        String text6 = "banana";
        System.out.println(text6.indexOf("na", 3)); // 4
        //ExampleIsEmpty Returns true if the string is empty (length == 0).
        String empty = "";
        String notEmpty = "Hello";
        System.out.println(empty.isEmpty());    // true
        System.out.println(notEmpty.isEmpty()); // false
        //ExampleLastIndexOfChar Returns the index of the last occurrence of the character.
        String text7 = "banana";
        System.out.println(text7.lastIndexOf('a')); // 5
        //ExampleLastIndexOfCharFrom Returns the index of the last occurrence of the character, searching backward starting from the given index.
        String text8 = "banana";
        System.out.println(text8.lastIndexOf('a', 4)); // 3
        //ExampleLastIndexOfString Returns the index of the last occurrence of the substring.
        String text9 = "hello world world";
        System.out.println(text9.lastIndexOf("world")); // 12
        //ExampleLastIndexOfStringFrom Returns the index of the last occurrence of the substring, searching backward starting from the given index.
        String text10 = "banana";
        System.out.println(text10.lastIndexOf("na", 4)); // 2
        //ExampleReplace Returns a new string with all occurrences of oldChar replaced by newChar.
        String text11 = "banana";
        System.out.println(text11.replace('a', 'o')); // bonono
        //ExampleToUpperCase converts all characters in the string to uppercase.
        String text12 = "hello";
        System.out.println(text12.toUpperCase()); // HELLO
        //ExampleTrim Removes leading and trailing whitespace.
        String text13 = "   hello world   ";
        System.out.println("Before: [" + text13 + "]");
        System.out.println("After: [" + text13.trim() + "]");
        //ExampleValueOf Returns the string representation of the double value.
        double number = 123.45;
        String str = String.valueOf(number);
        System.out.println("String value = " + str);
	}
	
	public static void main(String[] args) {
		
		new Ejercicio1().exercise1();

	}

}