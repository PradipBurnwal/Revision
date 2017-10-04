package principle2.usingComposition.beans;

public class CustomFlyable extends Vehicle implements IFlyable {

	@Override
	public void fly() {
		System.out.println("Flyable using new Technology : Compressed Gas");
	}

}
