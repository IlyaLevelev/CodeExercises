package sample;

public class Functions {

	public static void main(String[] args) {

		int x = 6;
		int y = 8;
		int z = 3;

		int m = maximum(x, y); // function call, passing arguments x,y, the function returns the result
	
		int m2 = maximum(m, z);
		
		System.out.println(m2);
		
		int m3 = maximum3(x, y, z);
		System.out.println(m3);
		
		
		boolean b = (m3 == 8);
		check(b);
		
		check(m3 == 8);
		
		
		int m4 = maximum3(6, 2, 5);
		check(m4 == 6);
		
		int m5 = maximum3(4, 2, 5);
		check(m5 == 5);
		
		System.out.println("asserts:");
		
		// inline refactor to avoid variable
		assertTrue( maximum3(4, 99, 5) == 99 ); 
		assertTrue( maximum3(4, 2, 5) == 5 ); 
		assertTrue( maximum3(4, 1, 5) == 5 ); 
		assertTrue( maximum3(14, 1, 5) == 14 );
	}

	
	static void check(boolean test) {
		
		if (test == true) {
			System.out.println("Right");
		} else {
			System.out.println("Wrong");
		}
	}
	
	static void assertTrue(boolean test) {
		
		if (!test) {
			throw new RuntimeException("wrong!");
		}
	}
	
	
	
	static int maximum3(int a, int b, int c) {
		
		int m = maximum(a, b);
		int result = maximum(m, c);
		
		return result;
	}


	
	
	// function declaration
	static int maximum(int a, int b) {
		
		int result;
		
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		
		return result;
		
	}
	

}
