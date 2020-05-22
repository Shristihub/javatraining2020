package com.Assign.Trail;

import java.util.Scanner;

public class OneDarraysumavg {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int []marks =new int[4];
	
	marks[0]=90;
	marks[1]=50;
	marks[2]=40;
	marks[3]=30;
	int sum=0;
	for(int i=0;i<marks.length;i++){
		sum+=marks[i];
		
	}
	
	System.out.println("sum  "   +sum);
	float average =sum/marks.length;
	System.out.format("The average is : %.3f",average);
	sc.close();
    	   
       }}
	

