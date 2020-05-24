package com.dev.app;

public class Niki extends Shopping implements Chenniashoppingmall, Gvmall {

	public Niki(int quantity, double price) {
		super(quantity, price);
	}

	@Override
	public void gvmall() {
	System.out.println(quantity+price+"only tops &leggins");	
	}
	void luckyLocker() {
		System.out.println("car,bik||one gram gold");
	}

	@Override
	public void chenniashoppingmall() {
		System.out.println("ugadhi special dresses");
	}

	@Override
	String[] dressTypes() {
		return new String[] {"kurthis,bahubalisarees"};
	}

	@Override
	String[] dressColours() {
		return new String[] {"pink naviblue"};
	}

}
