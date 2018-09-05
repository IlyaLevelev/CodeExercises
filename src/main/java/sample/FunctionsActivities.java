package sample;

public class FunctionsActivities {

	public static void main(String[] args) {
		
		assertTrue ( subtractOrZero (0, 5) == 0 );
		assertTrue ( subtractOrZero (10, 3) == 7 );

		assertTrue ( compare (0, 0) == 0 );
		assertTrue ( compare (3, 2) == 1 );
		assertTrue ( compare (0, 2) == -1 );
		assertEquals ( compare (0, 2), -1 );
	
		assertTrue ( xor (false, true) == true );
		assertTrue ( xor (true, true) == false );
	
		assertTrue ( fits ("crocodile", 3, 8) == false );
		assertTrue ( mean (new double[] { 2, 3, 3, 1, 1}) == 2);	
		assertTrue ( fits ("house", 3, 8) == true );
		assertTrue ( mean (new double[] { 10, 9, 10, 8, 13}) == 10);
		
		
		assertEquals ( repeat ("cat", 3), "catcatcat" );
		assertEquals ( repeat ("dog", 2), "dogdog" );
		assertEquals ( repeat ("L", 5), "LLLLL" );
		assertEquals ( repeat ("", 5), "" );
		assertEquals ( repeat ("Lo", 1), "Lo" );

		// TDD: test driven development
		assertEquals( countLetter("crocodile", 'o'), 2 );

		System.out.println("ok");
	}
	
	static int countLetter (String text, char letter) {
		
		// text.charAt(0)
		// text.length()
		
		return 0;
	}
	
	static String repeat (String text, int times) {
		
		String result = "";
		int index = 0;
		while (index < times){
			result = result + text;
			index = index +1;	
		}	
		return result;
	}

	static int subtractOrZero (int a, int b) {
		
		if (b > a) {
			return 0;
		} else {
			return a-b;
		}
	}

	static int compare (int a, int b) {
		
		if (a > b) {
			return 1;
		}
		else if (a < b) {
			return -1;	
		}
		else {
			return 0;
		}
	}

	static boolean xor (boolean a, boolean b) {
		
		if (a && b) {
			return false;
		} else if (a || b) {
			return true;
		} else {
			return false;
		}
	}

	static boolean fits (String text, int minLength, int maxLength) {

		if (text.length() < minLength || text.length() > maxLength) {
			return false;
		} else {
			return true;
		}
	}

	static double mean (double[] values) {
		
		double sum = 0;
		
		for (double value : values) { 
			sum = sum + value;
		}

		/*
		for (int index = 0; index < values.length; index = index + 1) {
			sum = sum + values[index];
		}
		*/
		
		return sum / values.length;
	}

	static void assertTrue(boolean test) {

		if (!test) {
			throw new RuntimeException("wrong!");
		}
	}
	
	static void assertEquals(Object o1, Object o2) {

		if (!o1.equals(o2)) {
			throw new RuntimeException(o1 + " is not equal to " + o2);
		}
	}
}
