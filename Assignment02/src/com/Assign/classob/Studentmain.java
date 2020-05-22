package com.Assign.classob;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.Name="VINITHA";
		student1.Id=417;
		student1.getDetails();{}
		
		Scanner sc = new Scanner(System.in);
		int []marks =new int[4];{
		marks[0]=90;
		marks[1]=50;
		marks[2]=40;
		marks[3]=100;
		}
		;
		int sum=0;
		for(int i=0;i<marks.length;i++){
			sum+=marks[i];
			System.out.println("sum   "+sum);
			
		}

		double average =sum/marks.length;
		if (average>90)
			System.out.println("Grade  : A");
		else if(average>80||average<90)
			System.out.println("Grade   : B");
		
		
		sc.close();
	}
	       }
		



	


