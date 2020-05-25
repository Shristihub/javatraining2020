package com.training.demos;

import java.util.Scanner;

public class Primenumbers {

	
	public static void main(String[] args) {
		int s1,s2,num=0; 
		Scanner sc = new Scanner(System.in);
System.out.println("low limit :");
s1 = sc.nextInt();
System.out.println("upper limit");
s2 = sc.nextInt();

System.out.println("prime numbers between "+s1+"and "+s2+ "is :\n");
for (int k = s1; k <= s2; k++) {
	num=0;
	for (int k2 = 2; k2 < k; k2++) {
		if (k%k2==0) {
			num++;
			break;
			
			
		}
	}
	if (num==0) {
		System.out.println(k+"");
	sc.close();	
	}
	
}
	}
	

}
