package com.coupling.looseCoupling;

public class Main {

	public static void main(String[] args) {
		Journey journey = new Journey();
		journey.drive();
		
		/***
		 *  this method has different implementation 
		 *  than journey's drive method
		 */
		
		Racing racing = new Racing();
		racing.drive();
	}

}
