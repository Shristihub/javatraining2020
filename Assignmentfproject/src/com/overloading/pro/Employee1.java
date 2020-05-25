package com.overloading.pro;

public class Employee1 {
double calcBonus(int a) {
	System.out.println("double basic allowance"+a*3);
	return a;
	
}
double calcBonus(double b) {
	
	System.out.println("double basic allowance double car allowance"+b*2);
	return b;
}
void calcBonus(float c) {
	System.out.println("double basic allowance double car allowance double house allowance"+c*5);
}
void getDetails() {
	
}
}
