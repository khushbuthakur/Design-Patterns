package com.creational.factory_method;

public class Main {

	public static void main(String[] args) {
		/**
		 * show() method in all the classes are different 
		 * 
		 * rather than using all classes individually 
		 * 
		 * we make use of single class PhoneFactory,
		 * to get the phone based on input
		 * 
		 * Here user don't need to know the implementation
		 * they are just concerned with what they get
		 * 
		 * */

		OS os = PhoneFactory.getPhone(OsType.ANDROID);
		os.show(); // This is Android which is most powerful OS
		
		OS iphone = PhoneFactory.getPhone("iOS");
		iphone.show(); // Apple has the best animations
		
		OS windows = PhoneFactory.getPhone("other");
		windows.show(); // Mehhh! Who uses windows in phone???
		
		PhoneFactory.getPhone(OsType.OTHER).show();
		//Mehhh! Who uses windows in phone???
		
		PhoneFactory.getPhone(OsType.APPLE).show();
		//Apple has the best animations
		
		/**
		 * This is old way, where we are calling classes in a
		 * hard coded way
		 * */
		
		/*Android android = new Android();
		android.show();

		Windows windows = new Windows();
		windows.show();

		Apple apple = new Apple();
		apple.show();*/

	}

}
