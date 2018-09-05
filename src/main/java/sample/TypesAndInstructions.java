package sample;

public class TypesAndInstructions {
	
	public static void main(String[] args) {
		
		// declaration: type name;
		int age;
		double price;
		String name;
		boolean married;
		
		
		// assignment: variable = expression;
		age = 15;
		price = 500;
		married = true;
		
		
		// logic operators: && (AND), || (OR), ! (NOT)
		
		boolean applyDiscount = price > 300 && age < 18 && married; 
		
		// condition: if (expression) { ..... }
		if (applyDiscount) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
