package com.technoelevate.javabasics;

public class Test {

	public static void main(String[] args) {
		Car car = CarFactory.getCar();
		Driver driver = new Driver();
		driver.Driver(car);
	}
}
