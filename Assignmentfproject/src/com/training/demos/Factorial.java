package com.training.demos;

public class Factorial {

	public static void main(String[] args) {
		long n=7, fact=1;
		for (long i = 1; i < n; i++) {
			fact=fact*i;
		}
	System.out.println("factorial="+fact);	

	}

}
