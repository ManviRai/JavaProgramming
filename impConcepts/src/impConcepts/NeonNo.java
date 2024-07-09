package impConcepts;

import java.util.Scanner;

public class NeonNo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rem=0,sum=0;
	System.out.println("Enter the number");
	int num=sc.nextInt();
	
	int sqr=num*num;
	System.out.println("Square of number is"+sqr);
	while(sqr>0) {
	rem=sqr%10;
	sum+=rem;
	sqr=sqr/10;
	}
	System.out.println("Sum of the number is"+sum);
	if(num==sum) {
		System.out.println("Neon number");
	}
	else {
		System.out.println("Not a neon number");
	}
}
}
