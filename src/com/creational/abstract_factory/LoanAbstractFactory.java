package com.creational.abstract_factory;

public class LoanAbstractFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loanName) {
		Loan loan = null;

		loanName = loanName.toUpperCase();

		switch (loanName) {
		case "HOME":
			loan = new HomeLoan();
			break;

		case "EDUCATION":
			loan = new EducationLoan();
			break;

		case "GOLD":
			loan = new GoldLoan();
			break;

		case "PERSONAL":
			loan = new PersonalLoan();
			break;
		}
		
		return loan;
	}

}
