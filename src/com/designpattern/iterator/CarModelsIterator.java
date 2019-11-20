package com.designpattern.iterator;

public class CarModelsIterator implements CarIterator<CarModels> {
	
	private CarModels[] carmodels;
	private int position = 0;

	 public CarModelsIterator(CarModels[] models) {
		this.carmodels = models;
	}
	
	@Override
	public void reset() {
		position = 0;

	}

	@Override
	public CarModels next() {
		
		return carmodels[position++];
	}

	@Override
	public CarModels currentItem() {
		return carmodels[position];
	}

	@Override
	public boolean hasNext() {
		 if(position >= carmodels.length)
	            return false;
	        return true;
	}

}
