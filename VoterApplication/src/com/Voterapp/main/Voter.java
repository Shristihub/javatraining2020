package com.Voterapp.main;
import com.Voterapp.Service.*;
import com.Voterapp.exception.LocalityNotFoundException;
import com.Voterapp.exception.NoVoterIDException;
import com.Voterapp.exception.UnderAgeException;

import java.util.Scanner;
public class Voter {
public static void main(String[] args) {
System.out.println("Right to Vote is a weapon to build a proper NATION'\n'VOTE for a bright future....!");
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age");
int age= sc.nextInt();
System.out.println("Enter your Locality");
String locality = sc.next();
System.out.println("Enter your VoterID");
int vid = sc.nextInt();
ElectionBooth EB= new ElectionBooth();
try{
	EB.checkage(age);
	EB.checklocality(locality);
	EB.checkVoterid(vid);
	EB.checkEligibility(age, locality, vid);
}
    catch(UnderAgeException e ){
	System.out.println(e.getMessage());
}
    catch(LocalityNotFoundException e){
	System.out.println(e.getMessage());
}
	catch(NoVoterIDException e){
		System.out.println(e.getMessage());
}
catch(NotEligibleException e){
	System.out.println(e.getMessage());
	sc.close();
}}}
