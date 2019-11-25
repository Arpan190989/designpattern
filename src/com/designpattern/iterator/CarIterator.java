package com.designpattern.iterator;

@SuppressWarnings("hiding")
public interface CarIterator<CarModels> {

	void reset();

	CarModels next();

	CarModels currentItem();

	boolean hasNext();

}
