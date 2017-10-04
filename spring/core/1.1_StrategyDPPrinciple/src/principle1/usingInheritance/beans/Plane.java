package principle1.usingInheritance.beans;

public class Plane extends Flyable {

	public Plane() {
		System.out.println("I am in Plane...");
		fly();
		halt();
		
	}
	
	
}
