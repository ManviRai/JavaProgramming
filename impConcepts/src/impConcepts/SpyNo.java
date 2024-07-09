package impConcepts;

import java.util.Scanner;

public class SpyNo {
    public static void main(String[] args) {
    	int rem=0,sum=0,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num>0) {
			rem=num%10;
			sum+=rem;
			mul*=rem;
			num=num/10;
			
		}
		System.out.println("Sum:"+sum);
		System.out.println("Mul:"+mul);
		if(sum==mul) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a spy number");
		}
		
	}
}
