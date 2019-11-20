package com.designpattern.iterator;

public interface CarIterator<CarModels> {
	
	void reset();
	
	CarModels next();
	
	CarModels currentItem();
	
	boolean hasNext();
	

}
