package sample;

public class ArrayExamples {

	public static void main(String[] args) {
		
		// create array with given values
		int[] prices = { 20, 80, 10, 60 };
		String[] products = { "notebook", "phone", "pen", "calculator", "idea" };
		
		// define array without values
		double[] grades;
		// create array with given quantity of values
		grades = new double[20];
		
		
		// read a value at some index
		int p = prices[2];
		System.out.println(prices[0]);
		
		
		// write a value at some index
		grades[3] = 7.5;
		System.out.println(grades[3]);
		
		// array length
		System.out.println(products.length);
		
		
		System.out.println("Prices:");
		
		int index = 0;
		
		while (index < prices.length) {	
			System.out.println(products[index] + " price is " + prices[index]);			
			index = index + 1;
		}
		
		String name = "Ferran";
		System.out.println(  "length of string: " + name.length()  );
		
	}

}
