package ass.over.demo;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
		
	}
	void withDraw(double amount){
		System.out.println("withdrawing "+amount+100);
		amount-=balance;
	}
	void depoist(double amount){
		System.out.println("depoist "+amount);
		amount+=balance;
	}
	double getBalance() {
		return balance;
		
	}

}
