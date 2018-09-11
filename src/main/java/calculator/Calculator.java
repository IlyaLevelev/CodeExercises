package calculator;

public class Calculator {

	private double result;
	
	public Calculator () {
		this.result = 0;
	}
	
	public void add (double value) {
		this.result = this.result + value;
	}
	
	public void subtract (double value) {
		this.result = this.result - value;
	}
	
	public double getResult () {
		return this.result;
	}
	
	public void multiply( double value) {
		this.result = this.result * value;
	}
	
	public void divide (double value) {
		this.result = this.result / value;
	}
	
	public void printStatus () {
		System.out.println("The result is " + this.result);
	}
}
