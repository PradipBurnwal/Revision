package principle2.usingComposition.beans;

public class MagicCar extends Vehicle {

	public MagicCar() {
		System.out.println("Using MagicCar");
		//setDrivable(new DefaultDrivable());
		//setFlyable(new DefaultFlyable());
		
		setDrivable(new CustomDrivable());
		setFlyable(new CustomFlyable());
	}
	

}
