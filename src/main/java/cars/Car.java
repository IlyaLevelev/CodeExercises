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
