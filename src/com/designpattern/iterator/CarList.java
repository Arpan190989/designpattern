package com.designpattern.iterator;

@SuppressWarnings("hiding")
public interface CarList<CarModels> {

	CarIterator<CarModels> iterator();

}
