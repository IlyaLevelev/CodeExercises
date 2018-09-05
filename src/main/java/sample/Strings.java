package sample;

/**
 * Declare a string (Texts) with the quantity of values 5. Introduce the word
 * hello at all positions of the Array. Show the result for each value of the
 * array.
 * 
 */

public class Strings {

	public static void main(String[] args) {

		String[] texts;
		texts = new String[5];

		for (int i = 0; i < texts.length; i++) {
			texts[i] = "hello";
			System.out.println(texts[i]);
		}
		
		for (int i = 0; i < texts.length; i++) {
			texts[i] = "Value is " + i;
			System.out.println(texts[i]);
		}
	}
}