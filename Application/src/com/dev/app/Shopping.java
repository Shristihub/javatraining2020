package com.dev.app;

public abstract class Shopping {
int quantity;
double price;
public Shopping(int quantity, double price) {
	super();
	this.quantity = quantity;
	this.price = price;
}
void shopDetails() {
	System.out.println("quantity"+quantity);
	System.out.println("price"+price);
}

	abstract String[]dressTypes();
abstract String[]dressColours();
}






















































