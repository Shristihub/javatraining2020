package com.shristi;

public class Car extends Vehicle{

	String review;

	public Car(String name, String model, double price, String review) {
		super(name, model, price);
		this.review = review;
	}

	@Override
	String[] showVehicleTypes() {
		return new String[] {"Honda","Audi","Benz"};
	}

	@Override
	int getMileage() {
		return 10;
	}

	@Override
	String getAccessories() {
		return "AC and rear mirror";
	}

	void showSafety(){
		System.out.println("Air Bags attached");
		
	}

	
}
