package com.technoelevate.javabasics;

public class Votertest {
public static void main(String[] args) {
	VoterApplication application= new VoterApplication();
	try {
		application.vote();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
