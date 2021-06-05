package com.creational.abstract_factory;

public class EducationLoan extends Loan {
	@Override
	public void setInterestRate(Double r) {
		rate = r;
	}
}
