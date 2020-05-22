package com.vehicle.demo;

public class Car extends Vehicle {

	public Car(String name, String model, int price) {
		 
    super(name, model, price);}
       
	    void PrintSafety1() {
		System.out.println("Open air bags when the car is in trouble");
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


	String getPrintSafety() {
		return "StaY home staY Safe";
	}}
    
	