package impConcepts;

import java.util.Scanner;

public class SunnyNo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rem=0,sum=0;
	System.out.println("Enter the number");
	int num=sc.nextInt();
	while(num>0) {
		rem=num%10;
		sum+=rem;
		num=num/10;
		
	}
	System.out.println(sum);
	double sqrt=Math.floor(Math.sqrt(sum));
	System.out.println(sqrt);
	if(sqrt*sqrt==sum) {
		System.out.println("It is a sunny number");
	}
	else {
		System.out.println("It is not sunny number");
	}
}
}
