package com.coupling.tightCoupling;

public class Journey {

	Car car = new Car();

	public void startJourney() {
		/** calling a method in Car
		 * if the drive method in Car class changes to 
		 * start, then we will have to make changes over here
		*/
		car.drive();
	}

}
