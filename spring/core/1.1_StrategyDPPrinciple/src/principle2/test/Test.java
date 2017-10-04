package principle2.test;

import principle2.usingComposition.beans.MagicCar;
import principle2.usingComposition.beans.Car;
import principle2.usingComposition.beans.Flight;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		car.getDrivable().drive();
		System.out.println();

		Flight flight = new Flight();
		flight.getFlyable().fly();
		System.out.println();
		
		MagicCar mCar = new MagicCar();
		mCar.getDrivable().drive();
		mCar.getFlyable().fly();
		
		
	}

}
