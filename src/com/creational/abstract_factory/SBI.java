package com.creational.abstract_factory;

public class SBI implements Bank {

	private final String bankName = "SBI";

	@Override
	public String getBankName() {
		return bankName;
	}

}
