package com.training.demos;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
	int	Number,i;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	Number = sc.nextInt();
	for ( i = 1; i <= Number; i++) {
		if (Number%i==0) {
			System.out.printf("%d",i);
			sc.close();
		}
	}
	}

}
