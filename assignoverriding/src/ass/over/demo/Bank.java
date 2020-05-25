package ass.over.demo;

public class Bank {
double balance;
	
	public Bank(double balance) {
	super();
	this.balance = balance;
}
	
	void withDraw(double amount){
		System.out.println("withdrawing "+amount);
		balance-=amount;
	}
	void depoist(double amount){
		System.out.println("depoist "+amount);
		balance+=amount;
	}

	double getBalance() {
		return balance;
		
	}
	}
	

