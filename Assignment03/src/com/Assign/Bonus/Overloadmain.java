package com.Assign.Bonus;
import java.util.Scanner;
public class Overloadmain{
public static void main(String[] args) {
       
	Scanner sc = new Scanner(System.in);
	String Name = sc.next();
	String Designation= sc.next();
	
	if     (Designation.equals("Programmer")){
	        Employee E1= new Employee();
	        E1.calcBonus(70);}
	        
	         if (Designation.equals("Manager")){
	    	Employee E2= new Employee();
	        E2.calcBonus(40);}
	     
	         if (Designation.equals("Director")){
	        Employee E3= new Employee();
		    E3.calcBonus(60);
	        sc.close();
			}}}
				
		
			
		
			
