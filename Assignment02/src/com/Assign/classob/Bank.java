package com.Assign.classob;

public class Bank {
	double   Balance;
	int Withdrawal;
	int Deposit;
	
       Bank(double B){
    	   Balance=B;
	    }
		
	void getDetails(){
		
		
		System.out.println(" Available Balance after withdrawal");
		System.out.println(Balance-(Withdrawal));
		
		
		System.out.println(" Available Balance after deposit ");
		System.out.println(Balance+(Deposit));

		}
	
	}
	
		
	

