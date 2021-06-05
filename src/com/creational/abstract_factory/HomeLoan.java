package com.creational.abstract_factory;

public class HomeLoan extends Loan {
	@Override
	public void setInterestRate(Double r) {
		rate = r;
	}
}
