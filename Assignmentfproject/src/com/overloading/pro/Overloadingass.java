package com.overloading.pro;

import java.util.Scanner;

public class Overloadingass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String designation = sc.next();
		if (designation.equals("programmer")) {
			Employee1 emp = new Employee1();
			emp.calcBonus(20);
		}
		if (designation.equals("manager")) {
			Employee1 emp1 = new Employee1();
			emp1.calcBonus(60);
		}
		
		if (designation.equals("director")) {
			Employee1 emp2 = new Employee1();
			emp2.calcBonus(80);
		}
			
}
}
