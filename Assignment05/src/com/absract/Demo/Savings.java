package com.absract.Demo;

public   class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		
	}

	@Override
	 void withdraw(int amount) {
		System.out.println("Savings withdraw");
		balance=balance-amount-100;
		
	}

	@Override void deposit(int amount) {
		System.out.println("Savings Deposit");
		balance=balance+amount+100;
       	
	}

}
