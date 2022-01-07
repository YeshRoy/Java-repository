package com.technoelevate.javabasics;

public class Benz implements Car {

	@Override
	public void start() {
		System.out.println("Benz has stared ");
		
	}

	@Override
	public void accelarate() {
		System.out.println("Benz has accelerated");		
	}

	@Override
	public void brake() {
		System.out.println("Benz has stopped");		
	}

	
}
