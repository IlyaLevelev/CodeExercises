package statistics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Double> numbers = new ArrayList<>();
		numbers.add(2.0);

		Statistics stats = new Statistics();
		stats.add(5.0);
		stats.add(7.0);
		stats.add(6.0);
		stats.add(6.0);
	

		Statistics stats2 = new Statistics();
		stats2.add(5.0);
		stats2.add(15.0);
		
		double sum = stats2.getSum(); // should be 24
		System.out.println(sum);
		double avg = stats.getAverage(); // should be 6
		System.out.println(avg);
	}

}
