package com.designpattern.adapter;
import com.designpattern.model.*;

public class ManualtoAutomaticAdapter implements AutomaticCar{
	
	
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
		System.out.println("updating engine to change the manual car to automatic");
		
	}

	@Override
	public void accelerate() {
		System.out.println("updating engine to change the accleration box to automatic");		
	}

	@Override
	public void service() {
		System.out.println("Adapting engine to automatic");	
		
	}

	@Override
	public void fixAutomatedGearBox() {
		System.out.println("Changing gearbox to automatic");
		
	}

}
