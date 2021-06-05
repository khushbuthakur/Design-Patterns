package com.creational.abstract_factory;

public class GoldLoan extends Loan {
	@Override
	public void setInterestRate(Double r) {
		rate = r;
	}
}
