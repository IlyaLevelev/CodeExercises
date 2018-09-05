package cars;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", 180);

		Car car2 = new Car("Audi", 300);
		
		//car1.speed = 7000;
		//car1.setSpeed(7000);
		car1.accelerate(50);
		
		System.out.println(car1.brand + " driving at " + car1.getSpeed() + "km/h");
		
		//car1.setSpeed(50);
		car1.accelerate(270);
		
		System.out.println(car1.brand + " driving at " + car1.getSpeed() + "km/h");


	}

}


