package com.Assign.ATm;

public class Account {
	    double balance;
	    
		public Account(double balance) {}
			
			    void Withdrawal(double amount){
			    System.out.println("Withdrawing  "+amount);
			    balance-=amount;
			     }
			    
			    void Deposit(double amount){
				System.out.println("Depositing  "+amount);
				balance+=amount;
				}
			        
			
			        double getDetails(){
			    	return balance;
			    }}
