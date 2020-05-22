package com.Assign.ATm;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		}

	@Override
	void Withdrawal(double amount) {
		System.out.print(" money to be withdrawn:");
        balance=amount-balance;
        }
		
	

	@Override
	void Deposit(double amount) {
		System.out.print("Enter money to be Deposited");
        balance=amount-balance;
        }

		
	
	}
