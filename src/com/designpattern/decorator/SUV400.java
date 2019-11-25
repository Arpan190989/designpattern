package com.designpattern.decorator;

import com.designpattern.constants.DesignPatternConstants;
import com.designpattern.proxy.CarManufacture;

public class SUV400 implements CarManufacture {

	@Override
	public String initiateManufacturing() {

		return DesignPatternConstants.CAR_MANUFACTURING_STARTED;

	}

}
