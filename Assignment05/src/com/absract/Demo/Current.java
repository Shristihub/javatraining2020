package com.absract.Demo;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	
	}

	@Override
	void withdraw(int amount) {
		System.out.println("Current withdraw");
		balance=balance-amount;		
	}

	@Override
	void deposit(int amount) {
		System.out.println("Current Deposit");
		balance=balance+amount;
		
	}
}
