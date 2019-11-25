package com.designpattern.proxy;

import com.designpattern.constants.DesignPatternConstants;

public class ProxyCarMechanic implements CarManufacture {

	private String mechanicName;

	public ProxyCarMechanic(String name) {
		this.mechanicName = name;
	}

	@Override
	public String initiateManufacturing() {

		if (isAuthorized()) {
			return DesignPatternConstants.CAR_MANUFACTURING_STARTED + mechanicName;
		}
		return null;

	}

	public boolean isAuthorized() {
		return false;
	}

}
