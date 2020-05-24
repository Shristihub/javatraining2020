package com.dev.app;

public class Totalshopping {

	public static void main(String[] args) {
Shopping shopp;
shopp = new Saisree(2, 2000);
shopp.dressColours();
String[]arr = shopp.dressColours();
for(String colours : arr) {
System.out.println(colours);
}
shopp.dressTypes();
String[]arr1 = shopp.dressTypes();
for(String types : arr1) {
System.out.println(types);
}
shopp.shopDetails();
Saisree sai = (Saisree)shopp;
sai.chenniashoppingmall();
sai.calcDiscount(20);
sai.whichFloor();
shopp = new Niki(4, 6000);
String[]ar = shopp.dressColours();
for(String colours : ar) {
System.out.println(colours);
}
shopp.dressTypes();
String[]arr2 = shopp.dressTypes();
for(String types : arr2) {
System.out.println(types);
}
shopp.shopDetails();
Niki nik = (Niki)shopp;
nik.luckyLocker();
nik.gvmall();
nik.chenniashoppingmall();

	}

}
