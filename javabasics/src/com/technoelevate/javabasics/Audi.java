package com.technoelevate.javabasics;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("Audi has started");
		
	}

	@Override
	public void accelarate() {
		System.out.println("Audi has accelerated");
	}

	@Override
	public void brake() {
		System.out.println("Audi has stooped");
		
	}

}
