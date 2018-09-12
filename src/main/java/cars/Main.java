package cars;

/**
 * Example of objects using Cars
 */
public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", 180);
		Car car2 = new Car("Audi", 300);
		Car car3 = car1;
		car3.accelerate(10);
		car3 = car2;
		car3.accelerate(5);
		
		car1.printStatus();
		car2.printStatus();
		car3.printStatus();

	}

}


