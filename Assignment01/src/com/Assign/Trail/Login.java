package com.Assign.Trail;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		
		String name= "sony";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name to login ");
		
		String Inputname=sc.next();
		
		if(name.equals(Inputname))
		{
			
			System.out.println("you are logged in successfully");}
			else
			
			{
				System.out.println("Invalid user name");
				sc.close();
			}
		}
		
		

	}


