package com.technoelevate.javabasics;

import java.util.Scanner;

public class VoterApplication {
public void vote() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your age:");
	int age =scanner.nextInt();
	if(age>=18) {
		System.out.println("Vote casted successfully");
	}else {
//		System.out.println("Not eligible to vote");
		throw new AgeValidatorException("Not eligible to vote");
	}
}
}
