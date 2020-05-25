package ass.over.demo;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
		
	}

	@Override
	void withDraw(double amount) {
System.out.println("Savings withdraw");
balance=balance-amount;
		//super.withDraw(amount);
	}

	@Override
	void depoist(double amount) {
		System.out.println("Savings depoist");
		balance = balance+amount;
		//super.depoist(amount);
	}
	

}
