package sample;

import java.util.*;

public class Util {

	public static void assertEquals(Object o1, Object o2) {

		if (!o1.equals(o2)) {
			throw new RuntimeException(o1 + " is not equal to " + o2);
		}
	}
	
	public static <T> List<T> asList(T... values) {
		List<T> result = new ArrayList<T>();
		for (T x : values) {
			result.add(x);
		}
		return result;
	}
}
