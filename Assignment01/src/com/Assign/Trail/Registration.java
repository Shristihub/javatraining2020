package com.Assign.Trail;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		
		String name= "sony";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name to register");
		String Inputname=sc.next();
		
	if    (name.equals(Inputname))
		{
			System.out.println("you are registered");}
			
		else
			{
				System.out.println("Name is not unique");
				sc.close();
			}
		}
		
	  
			  
	  	  
		  
	  }
		
		

	

