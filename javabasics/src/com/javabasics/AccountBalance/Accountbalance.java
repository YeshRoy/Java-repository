package com.javabasics.AccountBalance;

public class Accountbalance {

	double Balance = 200000;

	public Accountbalance() {

	}

	public void withdraw(Double amount) throws Insufficientbalanceexception {

		if (Balance >= amount) {

			System.out.println("Available balance:" + this.Balance);
			this.Balance-=amount;
			System.out.println(amount + "withdrawn successfully");
			System.out.println("remaining balance:" + this.Balance);
		} else {
//			System.out.println("Insufficient balance");
			throw new Insufficientbalanceexception("Insufficient balance");
		}
	}
}
