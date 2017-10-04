package principle1.test;

import principle1.usingComposition.beans.Car;
import principle1.usingComposition.beans.Flight;
import principle1.usingComposition.beans.MagicCar;

public class CompositionTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.getDrivable().drive();
		//car.getFlyable().fly();
		System.out.println(" ");
		
		Flight flight = new Flight();
		flight.getFlyable().fly();
		//flight.getDrivable().drive();
		System.out.println(" ");
		
		MagicCar mCar = new MagicCar();
		mCar.getDrivable().drive();
		mCar.getFlyable().fly();
		
	}
	

}
