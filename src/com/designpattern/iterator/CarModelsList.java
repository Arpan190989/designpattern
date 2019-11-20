package com.designpattern.iterator;

public class CarModelsList implements CarList<CarModels>{
	
	
	private CarModels[] carmodels;
	
	public CarModelsList(CarModels[] carmodels) {
		this.carmodels = carmodels;
	}

	@Override
	public CarIterator<CarModels> iterator() {
		return new CarModelsIterator(carmodels);
	}

}
