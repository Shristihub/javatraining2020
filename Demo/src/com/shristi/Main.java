package com.shristi;

public class Main {

	public static void main(String[] args) {

		Vehicle ref = new Car("Honda","City",89189.00,"5");
		System.out.println(ref.getAccessories());
		System.out.println(ref.getMileage());
		
		ref.showDetails();
		String[] arr = ref.showVehicleTypes();
		for (String type : arr) {
			System.out.println(type);
		}
		Car car = (Car)ref;
		car.showSafety();
	}

}
