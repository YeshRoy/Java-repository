package com.javabasics.AccountBalance;

import java.util.Scanner;

public class Accounttest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the amount :");
//		int balance = scanner.nextInt();
		Accountbalance account = new Accountbalance();
		double amount = scanner.nextDouble();
		try {
			account.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
