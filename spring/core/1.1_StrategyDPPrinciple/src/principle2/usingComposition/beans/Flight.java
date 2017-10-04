package principle2.usingComposition.beans;

public class Flight extends Vehicle{

	public Flight() {
		System.out.println("Using Flight");
		//setFlyable(new DefaultFlyable());
		setFlyable(new CustomFlyable());
	}

}
