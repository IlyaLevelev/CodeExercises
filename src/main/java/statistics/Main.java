package statistics;

public class Main {

	public static void main(String[] args) {

		// create Statistics class
		// it should have 2 fields: sum and count
		Statistics stats = new Statistics();
		
		stats.add(5);
		stats.add(7);
		stats.add(6);
		stats.add(6);
		
		double sum = stats.getSum(); // should be 24
		double avg = stats.getAverage(); // should be 6
		
	}

}
