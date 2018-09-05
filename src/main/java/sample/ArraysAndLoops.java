package sample;

/**
 * Declare array (numbers) with 5 values and show all the values with the while
 * function. Calculate the total and the mean of the (numbers) array. Calculate
 * the highest and the lowest number of the array.
 */

public class ArraysAndLoops {

	public static void main(String[] args) {

		double[] numbers = { 3, 2, 4, 2, 6 };
		
		
		
		int idx = 0; // initialization
		while (idx < numbers.length) { // condition
			System.out.println(numbers[idx]);
			idx = idx + 1; // increment
		}
		
		
		for (int i = 0; i < numbers.length; i++) { // init; cond; inc
			System.out.println(numbers[i]);
		}
		
		
		for (double number : numbers) { 
			System.out.println(number);
		}

		
		
		int index = 0;
		double total = 0;
		while (index < numbers.length) {
			total = total + numbers[index];
			index = index + 1;
		}
		double mean = total / numbers.length;
		System.out.println("total is " + total + "; mean is " + mean);
		
		double max = numbers[0];
		int i = 1;
		while (i < numbers.length) {			
			if (numbers[i] > max) {
				max = numbers[i];
			}
			i = i + 1;
		} // jumps up

		System.out.println("The highest is " + max);

		double min = numbers[0];
		i = 1;
		while (i < numbers.length) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			i = i + 1;
		}

		System.out.println("The lowest is " + min);
	}

}
