package sec.stude.ass;



import java.util.Scanner;
public class Studentid {

	

	public static void main(String[] args) {
		
		Student student =new Student();
		student.name="sai";
		student.id=123;
		//student.grades= "a,b,c";
		Student student1 =new Student();
		student1.name="sai";
		student1.id=123;
		student1.grades= "a,b,c";
		student.getDetails();  {
			
		}
		Scanner sc=new Scanner(System.in);
		int[][]marks=new int[4][4];{
			System.out.println("populating");
			marks[0][0]=70;
			marks[0][1]=40;
			marks[1][0]=40;
			marks[1][1]=60;
			
		}
		
		int sum=0;		
			
for (int i = 0; i < marks.length; i++) {
	for(int j=0;j<marks.length;j++) {
		
	sum+=marks[i][j];
	}
}	
		System.out.println("sum "+sum);
float average = sum/marks.length;
System.out.format("the average is:%3f",average);
if (average>60) {
	
System.out.println("a grade");
	
}
else if (average>40) {
	
System.out.println("b grade");}
else {
	System.out.println("c grade");
}
sc.close();
		}
		}
	
		


