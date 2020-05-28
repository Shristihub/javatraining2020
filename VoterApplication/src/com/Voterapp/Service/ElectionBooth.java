package com.Voterapp.Service;
import com.Voterapp.exception.*;
public class ElectionBooth {
public  boolean checkage(int age) throws UnderAgeException{
if(age<=18){
throw new UnderAgeException("your Age is not sufficient to vote");
 }
return true;
 }
String locality[]={"RK Nagar,Gandhi Nagar,Nehru Nagar"};
public boolean checklocality(String locality) throws LocalityNotFoundException{
for(String loc:this.locality){
if(loc.equals(locality)){
throw new LocalityNotFoundException(" Invalid Locality ");
 }
 }
return true;
 }
public boolean checkVoterid(int vid) throws NoVoterIDException{
if(vid>=1000||vid<=9000){
throw new NoVoterIDException("Voter ID found");
 }
return true;
 }
public boolean checkEligibility(int age, String locality,int vid)throws NotEligibleException{
if(age<=18||(locality!=locality)||(vid>=1000||vid<=9000)){
throw new NotEligibleException("You are not Eligile to Vote");
 }
return true;
 }
 }
