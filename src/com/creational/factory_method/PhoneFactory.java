package com.creational.factory_method;

public class PhoneFactory {

	/**
	 * We will decide OS based on user input
	 * */
	
	public static OS getPhone(String type) {
		OS os = null;

		type = type.toUpperCase();

		switch (type) {
		case "ANDROID":
			os = new Android();
			break;

		case "APPLE":
		case "IPHONE":
		case "IOS":
			os = new Apple();
			break;

		case "WINDOWS":
		case "OTHER":
			os = new Windows();
			break;
		}

		return os;
	}

}
