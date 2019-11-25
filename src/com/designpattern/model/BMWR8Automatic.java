package com.designpattern.model;

import com.designpattern.constants.DesignPatternConstants;

public class BMWR8Automatic implements AutomaticCar {

	@Override
	public void engineService() {
		System.out.println(DesignPatternConstants.CAR_SERVICING + DesignPatternConstants.AUTOMATIC_CAR);
	}

	@Override
	public void accelerate() {
		System.out.println(DesignPatternConstants.ACCLERATING + DesignPatternConstants.AUTOMATIC_CAR);

	}

	@Override
	public void service() {
		System.out.println(DesignPatternConstants.CAR_SERVICING + DesignPatternConstants.AUTOMATIC_CAR);

	}

	@Override
	public void fixAutomatedGearBox() {
		System.out.println(DesignPatternConstants.GAIRBOX_FIXING + DesignPatternConstants.AUTOMATIC_CAR);

	}

}
