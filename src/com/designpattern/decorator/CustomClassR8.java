package com.designpattern.decorator;

import com.designpattern.proxy.CarManufacture;

public class CustomClassR8 extends CarCustomizer{

	public CustomClassR8(CarManufacture carManufacture) {
		super(carManufacture);
		
	}
	
	@Override
	public String  initiateManufacturing() {
		return super.initiateManufacturing() + " with Snow wheels";

	}

}
