package com.designpattern.model;

import com.designpattern.constants.DesignPatternConstants;

public class CruiseMManual implements ManualCar {

	@Override
	public void engineService() {
		System.out.println(DesignPatternConstants.CAR_SERVICING + DesignPatternConstants.MANUAL_CAR);
	}

	@Override
	public void accelerate() {
		System.out.println(DesignPatternConstants.ACCLERATING + DesignPatternConstants.MANUAL_CAR);

	}

	@Override
	public void service() {
		System.out.println(DesignPatternConstants.CAR_SERVICING + DesignPatternConstants.MANUAL_CAR);

	}

	@Override
	public void fixManualGearBox() {
		System.out.println(DesignPatternConstants.GAIRBOX_FIXING + DesignPatternConstants.MANUAL_CAR);

	}

}
