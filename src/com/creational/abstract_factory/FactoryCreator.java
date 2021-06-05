package com.creational.abstract_factory;

public class FactoryCreator {

	public static AbstractFactory getFactory(String name) {
		if (name.equalsIgnoreCase("BANK")) {
			return new BankAbstractFactory();
		}

		return new LoanAbstractFactory();
	}
}
