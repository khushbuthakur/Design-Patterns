package com.creational.abstract_factory;

public class Demo {

	public static void main(String[] args) {

		String choice = "bank";
		AbstractFactory factory = FactoryCreator.getFactory(choice);
		Bank bank = factory.getBank("HDFC");
		
		AbstractFactory factory1 = FactoryCreator.getFactory("loan");
		
		Loan loan = factory1.getLoan("Education");
		loan.setInterestRate(8.2d);

		loan.calculateLoanPayment(90000, 1.5);
	}
}
