package com.designpattern.model;

public class CruiseMManual implements ManualCar {



	@Override
	public void engineService() {
		System.out.println("Servicing Manual Car");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating Manual Car");
		
	}

	@Override
	public void service() {
		System.out.println("Body Servicing Manual Car");
		
	}

	@Override
	public void fixManualGearBox() {
		System.out.println("Gear box Servicing Manual Car");
		
	}

}
