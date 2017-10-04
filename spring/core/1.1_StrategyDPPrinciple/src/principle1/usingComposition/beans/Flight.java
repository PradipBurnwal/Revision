package principle1.usingComposition.beans;

public class Flight extends Vehicle {

	public Flight() {
		System.out.println("I am using Flight...");
		setFlyable(new Flyable());
	}
	
	

}
