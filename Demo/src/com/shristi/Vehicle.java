package com.shristi;

public abstract class Vehicle {
	
	private String name;
	private String model;
	private double price;
	public Vehicle(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	void showDetails() {
		System.out.println("Name "+name);
		System.out.println("Model "+model);
		System.out.println("Price "+price);
	}
	abstract String[] showVehicleTypes();	
	abstract int getMileage();
	abstract String getAccessories();
	
	

}
