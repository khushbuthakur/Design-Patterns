package com.creational.abstract_factory;

public class ICICI implements Bank {

	private final String bankName = "ICICI";

	@Override
	public String getBankName() {
		return bankName;
	}

}
