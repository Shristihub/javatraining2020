package com.vehicle.demo;

public class Car extends Vehicle {

	public Car(String name, String model, int price) {
		super(name, model, price);
	}

	@Override
	void getDetails() {
		super.getDetails();
	}

	@Override
	String[] showVehicleTypes() {
		return new String []{"Honda","Audi","Benz"};
	}

	
	@Override
	int getMileage() {
		return 10;
	}

	@Override
	String getAccesories() {
		return "Ac and Mirror";
	}

	@Override
	String getPrintSafety() {
		return "StaY home staY Safe";
	}}
    
	