package com.dev.app;

public class Saisree extends Shopping implements  Chenniashoppingmall {

	public Saisree(int quantity, double price) {
		super(quantity, price);
	}

	@Override
	public void chenniashoppingmall() {
		System.out.println(quantity+price+"summer special offers");
	}

	@Override
	String[] dressTypes() {
		return new String[] {"zeans,t-shirts,saress"};
	}

	@Override
	String[] dressColours() {
		return new String[] {"multicolours available"};
	}
	
	void whichFloor() {
		System.out.println(" meanswear 1st floor\n ladies-2ndfloor ");
	}
	void calcDiscount(int a) {
		System.out.println("one plus one "+ a*2);
	}

}
