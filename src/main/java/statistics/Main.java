package statistics;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// create Statistics class
		// it should have 2 fields: sum and count
		Statistics stats = new Statistics(0, 0, null);
			
		numbers.add(5.0);
		stats.add(7.0);
		stats.add(6.0);
		stats.add(6.0);
		
		double sum = stats.getSum(); // should be 24
		double avg = stats.getAverage(); // should be 6
		
	}

}
