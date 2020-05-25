package com.training.demos;
import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		String Name ="sai";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		
		String Inputname=sc.next();
	
				if(Name.equals(Inputname))
				{System.out.println("Name is not Unique");}
				else
				{
					System.out.println("You are Registered");
				}
		
		
	}
}


