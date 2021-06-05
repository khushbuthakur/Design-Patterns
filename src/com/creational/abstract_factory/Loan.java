package com.creational.abstract_factory;

public abstract class Loan {
	protected double rate;

	abstract void setInterestRate(Double r);

	public void calculateLoanPayment(double amount, double years) {

		double noOfInstallments = years * 12;

		double annualInterestRate = (rate / 12) / 100;
		double r = Math.pow((1 + annualInterestRate), noOfInstallments);

		double emi = (amount * annualInterestRate * r) / (r - 1);

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Your amount $" + amount 
				+" \nmonthly EMI : $" + emi 
				+ " / month \nTenure: " + noOfInstallments 
				+ " months / " + years + " years" + 
		"\nInterest Rate : " + rate + "%");
		System.out.println("-----------------------------------------------------------------------------------");
	}

}
