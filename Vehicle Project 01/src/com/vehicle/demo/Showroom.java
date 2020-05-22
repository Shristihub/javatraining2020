package com.vehicle.demo;

public class Showroom {

	public static void main(String[] args) {
			
		Vehicle ref = new Car ("Benz","Hyundai",9_00_000);
			System.out.println(ref.getMileage());
			System.out.println(ref.getAccesories());
	        ref.getDetails();
			
	        String[] array= ref.showVehicleTypes();
			for(String type: array){
				
				System.out.println(type);}
				Car car = (Car)ref ;
				car.PrintSafety1(); 
	            
			Vehicle ref1 = new Bike ("Activa","Hero",70_000);
				System.out.println(ref1.getMileage());
				System.out.println(ref1.getAccesories());
				ref.getDetails();
		
				String[] array1= ref1.showVehicleTypes();
				for(String type: array1){
					System.out.println(type);
				
					
				}}}
			