package com.technoelevate.javabasics;

import java.util.Scanner;

public class CarFactory {

	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the car");
		String carName = scanner.next();

		if (carName.equals("BMW")) {
			return new BMW();

		} else if (carName.equals("Benz")) {
			return new Benz();
		} else if (carName.equals("audi")) {
			return new Audi();
		}
		return null;
	}
}
