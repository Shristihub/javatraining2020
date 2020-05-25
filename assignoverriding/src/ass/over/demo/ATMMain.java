package ass.over.demo;

import java.util.Scanner;


public class ATMMain {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		System.out.println("enter bank type s/c");
String accType = sc.next();
Bank account;//reference
if (accType.equals("s")) {
	account = new Savings(5000);
	
}else if(accType.equals("c")) {
	account = new Current(7000);
	
}else {
	account = new Bank(1000);
}
account.withDraw(1000);
System.out.println("Balance "+account.getBalance());
account.depoist(1000);
System.out.println("Balance "+account.getBalance());
}
}
}