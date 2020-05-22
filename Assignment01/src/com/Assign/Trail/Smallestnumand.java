package com.Assign.Trail;

import java.util.Scanner;

public class Smallestnumand {

	public static void main(String[] args) {
		int a=200,b=300,c=400;
		
		Scanner sc=new Scanner(System.in);
				if((a>b)&&(b>c)){
			a=sc.nextInt();
			System.out.println(b);
			
				
			if ((b>c)&&(c>a)){
				b=sc.nextInt();}
		        System.out.println(c);}
				
				else {System.out.println("Smallest number is:"+a);
				
				}
		
				sc.close();
			
			
		}

	}


