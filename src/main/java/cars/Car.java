package cars;

public class Car {

	String brand;
	private int speed;
	int maxSpeed;
	
	public Car(String brand, int maxSpeed) {
		
		this.brand = brand;
		this.speed = 0;
		this.maxSpeed = maxSpeed;
	}
	
	public void accelerate(int increment) {
		
		this.speed = this.speed + increment;
		
		if (this.speed > this.maxSpeed) {
			this.speed = this.maxSpeed;
		}
	}
	
	public void decelerate (int decline) {
		this.speed = this.speed - decline;
		if (this.speed < 0) {
			this.speed = 0;
		}
	}
	
	public void printStatus () {
		System.out.println(this.brand + " driving at " + this.speed + "km/h");
	}
	
		
	
	/*
	public void setSpeed(int speed) {
		
		if (speed > this.maxSpeed) {
			this.speed = this.maxSpeed;
		} else {
			this.speed = speed;
		}
	}
	*/
	
	public int getSpeed() {
		return this.speed;
	}
}
