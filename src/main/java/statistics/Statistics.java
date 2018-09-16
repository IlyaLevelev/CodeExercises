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
		double result;
		this.count = this.numbers.size();
		result = getSum() /  this.count;
		return result;
	}
}
