package com.designpattern.model;

public class BMWR8Automatic implements AutomaticCar {


	@Override
	public void engineService() {
		System.out.println("Servicing Automatic Car");	
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating Automatic Car");
		
	}

	@Override
	public void service() {
		System.out.println("Body Servicing Automatic Car");
		
	}


	@Override
	public void fixAutomatedGearBox() {
		System.out.println("Fixing gearbox of Automatic Car");

	}

}
