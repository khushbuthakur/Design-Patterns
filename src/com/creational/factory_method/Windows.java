package com.creational.factory_method;

public class Windows implements OS {
//	example of loose coupling
	@Override
	public void show() {
		System.out.println("Mehhh! Who uses windows in phone???");
	}

}
