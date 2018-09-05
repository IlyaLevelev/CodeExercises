package sample;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
		
		
		String[] countries;
		countries = new String[5];
		countries = new String[] { "Spain", "Germany" };
		System.out.println(countries[0]);
		
		
		List<String> animals; // declare a variable
		animals = new ArrayList<String>(); // create an empty list
		animals.add("dog");
		animals.add("horse");
		animals.add("cat");
		animals.add("crocodile");
		System.out.println(animals.get(0));
		
		// primitive types: int, double, boolean, char
		// equivalent classes: Integer, Double, Boolean, Character
		List<Integer> grades = new ArrayList<Integer>(); // creates an empty list
		List<Integer> values = Arrays.asList(1, 2, 8, 3, 5); // creates a list with the given values
		
		List<String> longAnimals = Arrays.asList("horse", "crocodile");
		List<String> x = longWords3 (animals, 5);
		Util.assertEquals( x, longAnimals );
		System.out.println("ok");
	}

	
	
	
	
	
	
	
	
	
	
	
	/** Return a list of the words that have the given minimum length */
	static List<String> longWords (List<String> words, int minLength) {
		
		List<String> result = new ArrayList<String>(); // create an empty list
		int index = 0;
		
		while (index < words.size()) {
			String word = words.get(index);
			if (word.length() >= minLength) {
				result.add(word);
			}
			index = index + 1;	
		}
		
		return result;
	}
	
	/** Return a list of the words that have the given minimum length */
	static List<String> longWords2 (List<String> words, int minLength) {
		
		List<String> result = new ArrayList<String>(); // create an empty list
		
		for (int index = 0; index < words.size(); index++) {
			String word = words.get(index);
			if (word.length() >= minLength) {
				result.add(word);
			}
		}
		
		return result;
	}

	/** Return a list of the words that have the given minimum length */
	static List<String> longWords3 (List<String> words, int minLength) {
		
		List<String> result = new ArrayList<String>(); // create an empty list
		
		for (String word : words) {
			if (word.length() >= minLength) {
				result.add(word);
			}
		}
		
		return result;
	}
}
