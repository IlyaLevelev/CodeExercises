package statistics;

import java.util.*;

public class Statistics {

	double sum;
	double count;
	List<Double> numbers;
	
	public Statistics (int sum, int count, List<Double> numbers) {
		
		this.sum = 0;
		this.count = 0;
		this.numbers = new ArrayList<Double>();
	
	}

	public void add(double d) {
		
		this.numbers = Arrays.asList (d);
		
	}

	public double getSum () {
		int i = 0;
		while (i<this.numbers.size()) {
			this.sum = this.sum + numbers.get(i);
			i = i + 1;
			
		}
		return this.sum;
	}
}
