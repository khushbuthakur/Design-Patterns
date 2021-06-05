package com.creational.abstract_factory;

public class BankAbstractFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		Bank bank = null;
		switch (bankName) {
		case "HDFC":
			bank = new HDFC();
			break;

		case "SBI":
			bank = new SBI();
			break;

		case "ICICI":
			bank = new ICICI();
			break;
		}
		return bank;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
