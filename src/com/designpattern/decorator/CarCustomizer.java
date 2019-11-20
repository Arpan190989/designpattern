package com.designpattern.decorator;

import com.designpattern.proxy.CarManufacture;

public abstract class CarCustomizer implements CarManufacture {
	
	private CarManufacture carmanufacture;
	
	public CarCustomizer(CarManufacture carManufacture) {
		this.carmanufacture = carManufacture;
	}

	@Override
	public String initiateManufacturing() {
		return carmanufacture.initiateManufacturing();

	}

}
