package principle2.usingComposition.beans;

public class DefaultFlyable extends Vehicle implements IFlyable{

	@Override
	public void fly() {
		System.out.println("Flying using old technology - Diesel");
	}

}
