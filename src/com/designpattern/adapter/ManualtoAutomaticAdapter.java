package com.designpattern.adapter;

import com.designpattern.constants.DesignPatternConstants;
import com.designpattern.model.AutomaticCar;
import com.designpattern.model.ManualCar;

public class ManualtoAutomaticAdapter implements AutomaticCar {

	ManualCar anyCar;

	public ManualtoAutomaticAdapter(ManualCar car) {
		this.anyCar = car;
		engineService();
		accelerate();
		service();
		fixAutomatedGearBox();
	}

	@Override
	public void engineService() {
		System.out.println("Updating engine to change the" + DesignPatternConstants.MANUAL_CAR + "to"
				+ DesignPatternConstants.AUTOMATIC_CAR);

	}

	@Override
	public void accelerate() {
		System.out.println("Updating engine to change the" + DesignPatternConstants.ACCLERATING + "to"
				+ DesignPatternConstants.AUTOMATIC_CAR);
	}

	@Override
	public void service() {
		System.out.println("Adapting engine to" + DesignPatternConstants.AUTOMATIC_CAR);

	}

	@Override
	public void fixAutomatedGearBox() {
		System.out.println("Changing gearbox to" + DesignPatternConstants.AUTOMATIC_CAR);

	}

}
