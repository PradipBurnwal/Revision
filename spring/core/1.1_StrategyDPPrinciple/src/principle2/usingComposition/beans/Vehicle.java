package principle2.usingComposition.beans;

public class Vehicle {
	private IDrivable drivable;
	private IFlyable flyable;
	public void halt(){
		System.out.println("Vehicle stopped");
	}
	public IDrivable getDrivable() {
		return drivable;
	}
	public void setDrivable(IDrivable drivable) {
		this.drivable = drivable;
	}
	public IFlyable getFlyable() {
		return flyable;
	}
	public void setFlyable(IFlyable flyable) {
		this.flyable = flyable;
	}
	

}
