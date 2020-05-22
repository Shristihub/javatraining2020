package com.vehicle.demo;

public class Bike extends Vehicle {

	public Bike(String name, String model, int price) {
		super(name, model, price);
	}

	@Override
	void getDetails() {
		super.getDetails();
	}

	@Override
	String[] showVehicleTypes() {
		
		return new String[]{"Activa","Honda","Pulsar"} ;
	}

	@Override
	int getMileage() {
		return 20;
	}

	@Override
	String getAccesories() {
		return "Mirrors and Helmet";
	}

	@Override
	String getPrintSafety() {
		return "Be aware of CARONA";
	}
	

	
}
