package sample;

public class FunctionExercise {

	public static void main(String[] args) {
			
		assertTrue( sum (3, 4) == 7 );
		assertTrue( sum (8, -4) == 4 );
		assertTrue( sum (33, 4) == 37 );
		
		System.out.println("ok");
	}
	
	static int sum (int a, int b) {
		int result;
		result = a + b;
		return result;
	}

	static void assertTrue(boolean test) {
		
		if (!test) {
			throw new RuntimeException("wrong!");
		}
	}
}
