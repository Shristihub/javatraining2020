package com.vehicle.demo;

public abstract class Vehicle {
    private String Name;
    private String  Model;
	private int Price;
	
        public Vehicle(String name, String model, int price) {
		super();
		Name = name;
		Model = model;
		Price = price;
	}
	    void  getDetails(){
		System.out.println("Name  : " +Name);
		System.out.println("Model : " +Model);
		System.out.println("Price : " +Price);
	}
		
		abstract String [] showVehicleTypes();
		abstract  int getMileage();
		abstract String getAccesories();
}