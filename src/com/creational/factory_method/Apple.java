package com.creational.factory_method;

public class Apple implements OS {

	//example of loose coupling
	@Override
	public void show() {
		System.out.println("Apple has the best animations");
	}

}
