package com.Assign.ATm;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void Withdrawal(double amount) {
		balance=balance-amount;
		System.out.print("Balance after  withdrawal:"+balance);
      }

	@Override
	void Deposit(double amount) {
		balance=balance+amount;
		System.out.print("Balance after the Deposit:"+balance);
        
}}


