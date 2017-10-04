package principle2.usingComposition.beans;

public class DefaultDrivable extends Vehicle implements IDrivable{
	@Override
	public void drive() {
		System.out.println("Driving using old technology - Diesel");
	}

}
