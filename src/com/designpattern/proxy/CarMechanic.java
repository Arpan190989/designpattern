package com.designpattern.proxy;

public class CarMechanic implements CarManufacture {

	private String mechanicName;
	
	public  CarMechanic(String name) {
		this.mechanicName = name;
	}
	
	@Override
	public String initiateManufacturing() {
		return "Car manufacturing started by "+ mechanicName;
	}

}
