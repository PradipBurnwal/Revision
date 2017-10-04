package principle2.usingComposition.beans;

public class Car extends Vehicle{

	public Car() {
		System.out.println("Using Car");
		//setDrivable(new DefaultDrivable());
		//Principle 3- Code should be open for extention & close for modification
		setDrivable(new CustomDrivable());
	}
	

}
