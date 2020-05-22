package com.Assign.ATm;
import java.util.Scanner;
public class VirtualATM {
    public static void main(String[] args) {
	
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Enter account type S/C");

         String acctype = sc.next();
         Account account;
  
        if(acctype.equals("S")){
	      account= new Savings(5000);
	}
	      else if (acctype.equals("C")){
		  account= new Current(7000);
		}
	else{
		  account = new Account(1000);
        			}
        account.Withdrawal(300);
	      System.out.println("Balance "+account.getDetails());
	
	      account.Deposit(5000);
	      System.out.println("Balance "+account.getDetails());
	      sc.close();
}}
