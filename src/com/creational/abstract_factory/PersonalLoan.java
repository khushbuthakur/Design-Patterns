package com.creational.abstract_factory;

public class PersonalLoan extends Loan {
	@Override
	public void setInterestRate(Double r) {
		rate = r;
	}
}
