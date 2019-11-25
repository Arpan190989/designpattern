package com.designpattern.proxy;

import com.designpattern.constants.DesignPatternConstants;

public class CarMechanic implements CarManufacture {

	private String mechanicName;

	public CarMechanic(String name) {
		this.mechanicName = name;
	}

	@Override
	public String initiateManufacturing() {
		return DesignPatternConstants.CAR_MANUFACTURING_STARTED + mechanicName;
	}

}
