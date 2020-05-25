package com.training.demos;

import java.util.Scanner;


public class Assignmentfour {

	public static void main(String[] args) {
	Scanner SC= new Scanner(System.in);
	int[]marks=new int[4];
	System.out.println("populating");

	marks[0] = 90;
			marks[1] =56;
			marks[2]=92;
			marks[3]=32;
			int sum =0;
			for (int i = 0; i < marks.length; i++) {
				sum+=marks[i];
				float average;
				
			}
			System.out.println("sum"+sum);		
			float average = sum/marks.length;
System.out.format("the average is:%.3f",average);
SC.close();
	}

}
