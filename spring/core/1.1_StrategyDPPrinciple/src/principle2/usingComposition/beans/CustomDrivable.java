package principle2.usingComposition.beans;

//Principle 3- Code should be open for extention & close for modification

public class CustomDrivable extends Vehicle implements IDrivable {
	@Override
	public void drive() {
		System.out.println("Drive using new technology : Petrol");
	}

}
