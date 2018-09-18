package statistics;

import java.util.*;

public class Statistics {

	List<Double> numbers;
	
	public Statistics () {
		
		this.numbers = new ArrayList<Double>();
		
	}

	public void add(double d) {
		
		this.numbers.add(d);
	}

	public double getSum () {
		
		double result = 0;
		int i = 0;
		while (i<this.numbers.size()) {
			result = result + numbers.get(i);
			i = i + 1;
			
		}
		return result;
	}
	public double getAverage () {
		
		return this.getSum() / this.numbers.size();
	}
}
