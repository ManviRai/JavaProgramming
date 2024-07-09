package impConcepts;

import java.util.Scanner;

public class TechNo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rem=0,sum=0;
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int temp=num;
	int number=num;
	int count=0;
	while(temp!=0) {
		temp/=10;
		count++;
	}
	System.out.println("Digits "+count);
	if(count%2==0) {
			rem=num%100;
			num=num/100;
		    sum=num+rem;
		}
	
		 System.out.println("First half"+num);
			System.out.println("Second half"+rem);
		 System.out.println("Sum"+sum);
		 int sqr= sum*sum;
		 System.out.println("Square of number"+sqr);
		 if(number==sqr) {
			 System.out.println("Tech No");
		 }
		 else {
			 System.out.println("Not tech number");
		 }
	}
}

