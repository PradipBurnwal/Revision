package principle1.usingComposition.beans;

public class Car extends Vehicle {

	public Car() {
		System.out.println("I am using Car....");
		setDrivable(new Drivable());
	}
	

}
