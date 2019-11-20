package com.designpattern.proxy;


public class ProxyCarMechanic implements CarManufacture {
	
	private String mechanicName;
	
	public ProxyCarMechanic(String name) {
		this.mechanicName = name;
	}

	@Override
	public String initiateManufacturing() {
		
		if(isAuthorized())
		{
			return "Car manufacturing started by "+ mechanicName;
		}
		return null;

	}
	
	
	public boolean isAuthorized()
	{
		return false;
	}

}
