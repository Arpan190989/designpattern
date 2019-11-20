package com.designpattern.decorator;

import com.designpattern.proxy.CarManufacture;

public class SUV400 implements CarManufacture {

	@Override
	public String  initiateManufacturing() {
		
		return "Car manufacturing started";

	}

}
