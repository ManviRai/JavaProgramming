package impConcepts;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int rem=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int num=sc.nextInt();
	int temp=num;
	int number=num;
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
	System.out.println("Digits:"+count);
	 while(temp!=0) {
		 rem=temp%10;
		 sum+=Math.pow(rem, count);
		 temp=temp/10;
	 }
	 System.out.println("Sum :"+sum);
	 if(number==sum) {
		 System.out.println("ArmStrong Number");
	 }
	 else {
		 System.out.println("Not ArmStrong number");
	 }
	}
}