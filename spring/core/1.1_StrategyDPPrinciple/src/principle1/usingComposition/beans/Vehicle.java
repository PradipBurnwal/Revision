package principle1.usingComposition.beans;

public class Vehicle {
	
	private Drivable drivable;
	private Flyable flyable;
	
	public void halt(){
		System.out.println("Vehicle is Stopped");
	}

	public Drivable getDrivable() {
		return drivable;
	}

	public void setDrivable(Drivable drivable) {
		this.drivable = drivable;
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}
	

}
