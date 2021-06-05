package com.creational.abstract_factory;

public class HDFC implements Bank {

	private final String bankName = "HDFC";

	@Override
	public String getBankName() {
		return bankName;
	}

}
