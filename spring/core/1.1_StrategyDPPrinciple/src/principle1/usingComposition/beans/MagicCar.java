package principle1.usingComposition.beans;

public class MagicCar extends Vehicle {

	public MagicCar() {
		System.out.println("I am using MagicCar..");
		setDrivable(new Drivable());
		setFlyable(new Flyable());
	}
	

}
