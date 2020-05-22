package com.vehicle.demo;

public class Main {
	public static void main(String[] args){
	Vehicle ref = new Car ("Suzuki","Honda",700000);
	System.out.println(ref.getMileage());
	System.out.println(ref.getAccesories());
	System.out.println(ref.getPrintSafety());
	
	
	String[] array= ref.showVehicleTypes();
	for(String type: array){
		System.out.println(type);
	}
	Vehicle ref1 = new Bike("Activa","Hero",80000);
	System.out.println(ref1.getMileage());
	System.out.println(ref1.getAccesories());
	System.out.println(ref1.getPrintSafety());
	
	
	String[] array1 = ref1.showVehicleTypes();
	for(String type: array1){
		System.out.println(type);
	}

	
	
	
	}}
		


