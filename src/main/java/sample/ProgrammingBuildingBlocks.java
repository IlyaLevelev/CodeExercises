package sample;

import java.util.*; // Allow us to use classes from java.util package (List, Map, etc.) without their full name

/**
 * Summary of the building blocks of a programming language.
 * (Note: this is a class comment)
 */
public class ProgrammingBuildingBlocks {

	/** 
	 * The main method is where the program starts.
	 * (Note: this is a method comment)
	 */
	public static void main(String[] args) {
		
		 // (Note: this is a line comment; it's ignored by the program)
		
		// --- Print method ---
		// Prints a message on the screen (on the output, the console)
		System.out.println(">>> Program starts here <<<");
		System.out.println();

		variablesExample();		
		expressionsExample();
		conditionalsExample();
		loopsExample();
		arraysExample();
		listsExample();
		mapsExample();
		
		// TODO: maps, methods, classes

		System.out.println(">>> Program ends here <<<");		
	}

	private static void variablesExample() {
		
		System.out.println("--- Types, variables, values ---");

		// --- Variable declaration ---
		// Reserves a piece of memory to store a value.
		// Syntax:
		// TYPE VARIABLE_NAME;
		String name;
		int quantity;
		double price;
		boolean available;
		
		// --- Assignment ---
		// Puts a value into a variable (overwrites previous value).
		// Syntax:
		// VARIABLE_NAME = VALUE;
		name = "jeans";
		quantity = 20;
		price = 30.5;
		available = true;
		// quantity = "a lot"; // WRONG! --> The VALUE type must be the same type as the variable. 


		// --- Variable declaration + assignment ---
		// Shortcut to declare a variable and assign an initial value.
		// Syntax:
		// TYPE VARIABLE_NAME = VALUE;
		String productCode = "JN123"; // in Java, variable naming convention is "camelCase"
		double weight = 0.5;
		
		// Print a message that contains the value of a variable
		System.out.println("Price: " + price);
		
		System.out.println();
	}

	private static void expressionsExample() {
		
		System.out.println("--- Expressions ---");

		String name = "pen";
		int quantity = 5;
		double price = 2.5;
		
		// --- Operators ---
		// A value can be an expression that combines single values and variables using operators (+, -, *, /)
		double totalPrice = price * quantity;
		// A String (text) can be made of strings and other values (joined using the `+` operator).
		String message = "Total price of " + quantity + " " + name + ": " + totalPrice;
		System.out.println(message);

		// TODO: math, comparison and logical operators / expression type

		System.out.println();
	}

	private static void conditionalsExample() {
		
		double totalPrice = 500;
		
		System.out.println("--- Flow control: if/else ---");
		
		// --- Conditional (if) ---
		// Executes some instructions if the condition is true.
		// Syntax:
		// if (CONDITION) { STATEMENTS }
		if (totalPrice > 100) {
			totalPrice = totalPrice * 0.9; // Apply 10% discount
		}
		System.out.println("Total price after discount 1: " + totalPrice);
	
		// --- Conditional (if/else) ---
		// Executes some instructions if the condition is true, otherwise executes other instructions.
		// Syntax: if (CONDITION) { STATEMENTS } [ else { STATEMENTS } ]
		if (totalPrice > 1000) {
			totalPrice = totalPrice - 20;  // Apply discount of 20
		} else {
			totalPrice = totalPrice - 5; // Apply discount of 5
		}		
		System.out.println("Total price after discount 2: " + totalPrice);
		
		// --- Conditional (if/else if/else) ---
		// We can chain multiple if/else
		// Syntax:
		// if (CONDITION) { STATEMENTS } [ else if (CONDITION) { STATEMENTS } ]* [ else { STATEMENTS } ]
		if (totalPrice > 1000) {
			totalPrice = totalPrice * 0.8;  // Apply 20% discount
		} else if (totalPrice > 500) {
			totalPrice = totalPrice * 0.85; // Apply 15% discount
		} else if (totalPrice > 100) {
			totalPrice = totalPrice * 0.9;  // Apply 10% discount
		} else {
			totalPrice = totalPrice * 0.95; // Apply 5% discount
		}
		System.out.println("Total price after discount 2: " + totalPrice);

		System.out.println();
	}

	private static void loopsExample() {
		
		System.out.println("--- Flow control: while/for loops ---");
		
		// --- Loop (while) ---
		// Executes some instructions while the condition is true (i.e. until the condition is false).
		
		System.out.print("while loop:  "); // Note print() doesn't add a new line at the end, like println() does 
		
		int i = 0;
	
		// Syntax: while (CONDITION) { STATEMENTS }
		while (i < 5) {
			System.out.print("i = " + i + "   ");
			i = i + 1;
		}
		
		System.out.println(); // Just adds a new line, so next print is written in a new line

		
		// --- Loop (for) ---
		// Similar to `while` loop but more compact.

		System.out.print("for loop:  ");

		// Syntax:
		// for (INITIALIZATION, CONDITION, INCREMENT) { STATEMENTS }
		for (int j = 0; j < 5; j = j + 1) {
			System.out.print("j = " + j + "   ");
		}

		System.out.println();
		System.out.println();
	}

	private static void arraysExample() {
		
		System.out.println("--- Arrays ---");

		// --- Arrays ---
		// They hold multiple values of the same type.
		// Comparison to lists: once an array is created, its length is decided and cannot be changed.

		// Syntax for declaration:
		// TYPE[] NAME;
		int[] numbers;
		String[] names;
		
		// Syntax for creating an array of given values:
		// VARIABLE = new TYPE[] { value1, value2, value3, ... };
		numbers = new int[] { 5, 3, 20, -7, 9 };

		// Syntax for creating an array of given size (values not set yet):
		// VARIABLE = new TYPE[SIZE];
		names = new String[3];
		
		// Syntax for accessing the value at some index (starting at 0):
		//           ARRAY[INDEX]
		int number = numbers[2];
		System.out.println("Number at index 2: " + number);
		
		// Syntax for setting the value at some index (starting at 0):
		// ARRAY[INDEX] = VALUE;
		names[0] = "Mary";
		names[1] = "John";
		names[2] = "Alex";
		
		// Accessing array length
		System.out.println("There are " + numbers.length + " numbers");
		
		// Using a loop to read or write to an array
		int index = 0;
		while (index < numbers.length) {
			System.out.println("Number at index " + index + ": " + numbers[index]);
			index++; // same as: index = index + 1;
		}
		
		// Especial for-loop when we just want to use all the values in the array
		System.out.print("All names: ");
		for (String name : names) {
			System.out.print(name + "  ");
		}
		
		System.out.println();
		System.out.println();
	}

	private static void listsExample() {
		
		System.out.println("--- Lists ---");

		// --- Lists ---
		// They hold multiple values of the same type.
		// Comparison to arrays: Lists are usually created empty, and you can add values to it.

		// Syntax for declaration:
		// List<TYPE> NAME;
		List<Integer> numbers; // instead of primitive types int, double, boolean we need to use Integer, Double, Boolean
		List<String> names;
		
		// Creating a list of given values:
		// VARIABLE = Arrays.asList( value1, value2, value3, ... );
		numbers = Util.asList(5, 3, 20, -7, 9); // TODO: why can't find Arrays.asList ???

		// Creating an empty list:
		// VARIABLE = new ArrayList<TYPE>();
		names = new ArrayList<String>();
		names = new ArrayList<>(); // In new Java versions we can omit the type
		
		//Accessing the value at some index (starting at 0):
		//           LIST.get(INDEX)
		int number = numbers.get(2);
		System.out.println("Number at index 2: " + number);
		
		// Adding a value to a list:
		// LIST.add(VALUE);
		names.add("Mary");
		names.add("John");
		names.add("Alex");
		
		// Accessing list size
		System.out.println("There are " + numbers.size() + " numbers");
		
		// Using a loop to read or write to a list
		int index = 0;
		while (index < numbers.size()) {
			System.out.println("Number at index " + index + ": " + numbers.get(index));
			index++; // same as: index = index + 1;
		}
		
		// Especial for-loop when we just want to use all the values in the array
		System.out.print("All names: ");
		for (String name : names) {
			System.out.print(name + "  ");
		}
		System.out.println();
		
		// We can also print a whole list (it has a fixed format)
		System.out.println("All numbers: " + numbers);
		
		System.out.println();
	}

	private static void mapsExample() {
	
		System.out.println("--- Maps ---");

		// --- Maps ---
		// Also called dictionaries. They hold pairs of values (key, value) so you can retrieve a value by its key.
		// The concept is similar to List, but in a list the keys are numbers (0, 1, 2, etc.) while in a map they can be any type.

		// Syntax for declaration:
		// Map<KEY_TYPE, VALUE_TYPE> NAME;
		Map<String, Integer> grades;
		
		// Creating an empty map:
		// VARIABLE = new HashMap<KEY_TYPE, VALUE_TYPE>();
		grades = new HashMap<String, Integer>();
		grades = new HashMap<>(); // In new Java versions we can omit the types
	
		// Adding pairs of values:
		// VARIABLE.put(KEY, VALUE);
		grades.put("Mary", 8);
		grades.put("John", 7);
		grades.put("Alex", 9);
		
		// Accessing a value by its key
		// VARIABLE.get(KEY)
		int gradeForJohn = grades.get("John");
		System.out.println("John's grade: " + gradeForJohn);
		
		// Iterate all values in a map
		System.out.print("All grades: ");
		for (int grade : grades.values()) {
			System.out.print(grade + "  ");
		}
		System.out.println();

		// Iterate all keys in a map
		System.out.print("All names with their grades: ");
		for (String name : grades.keySet()) {
			System.out.print(name + " -> " + grades.get(name) + "  ");
		}
		System.out.println();
		
		// We can also print a whole map (it has a fixed format)
		System.out.println("All grades: " + grades);

		System.out.println();
	}
}