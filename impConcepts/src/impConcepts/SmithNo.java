package impConcepts;

import java.util.Scanner;

public class SmithNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
	    int rem=0,sum=0;
	 	   while(num!=0) {
			rem=num%10;
			sum+=rem;
				num/=10;		
				}
		System.out.println("SUM:"+sum);
		
		int primes=0,rem1=0;
		for(int i=2;i<=temp;i++) {
				while(temp%i==0) {
					int value=i;
					while(value!=0) {
						rem1=value%10;
						primes+= rem1;
					value/=10;
				  }
					temp=temp/i;
			}		
}
		System.out.println("Primes:" +primes);
		if(sum == primes) {
			System.out.println("Smith number");
		}
		else {
			System.out.println("Not Smith umber");
		}
	}
}


