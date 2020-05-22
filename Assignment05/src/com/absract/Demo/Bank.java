package com.absract.Demo;

abstract  class Bank{
	double balance;
	Bank(double b){
		abstract void withdraw(double amount);
		abstract void deposit(double amount);
		double getBalance();
		
	}
	private void getBalance() {
		
		
	}

}
