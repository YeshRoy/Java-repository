package com.technoelevate.javabasics;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("Bmw has started");
		
	}

	@Override
	public void accelarate() {
		System.out.println("Bmw has accelerated");
	}

	@Override
	public void brake() {
		System.out.println("Bmw has stooped");
		
	}
	
	

}
