package com.shristi;

public class Bike extends Vehicle {

	public Bike(String name, String model, double price) {
		super(name, model, price);
	}

	@Override
	String[] showVehicleTypes() {
		return new String[] {"HD","Bullet","Honda"};
	}

	@Override
	int getMileage() {
		return 8;
	}

	@Override
	String getAccessories() {
		return "Helmet and gloves";
	}

}
