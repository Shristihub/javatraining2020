package com.training.demos;


import java.util.Scanner;

public class Assignmenttwo {

	public static void main(String[] args) {
		int a,b,c;
		a=12;
		b=32;
		c=26;
		Scanner SC = new Scanner(System.in);
		System.out.println(a);
		if ((a>b)&&(b>c)) {
			a=SC.nextInt();
			System.out.println(b);
			if((b>c)&&(c>a)) {
				b=SC.nextInt();
				System.out.println(c);
				if((c>a)&&(a>b)) {
					c=SC.nextInt();
					SC.close();
				}
			}
			}
	}
}
		
		
	              
		

	



