package com.coupling.looseCoupling;

public class Journey implements Car {
	/**
	 * We can change this method however we want
	 * So this is loose coupling
	 */
	@Override
	public void drive() {
		System.out.println("Journey has started. We are dirivng!!!");
	}
}
