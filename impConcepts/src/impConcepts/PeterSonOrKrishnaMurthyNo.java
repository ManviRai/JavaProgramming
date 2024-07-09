package impConcepts;

import java.util.Scanner;

public class PeterSonOrKrishnaMurthyNo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0,rem=0;
	int temp=num;
	while(num>0) {
		rem=num%10;
		sum+=fact(rem);
		num=num/10;
		
	}
	System.out.println("Sum of factorial:"+sum);
	if(temp==sum) {
		System.out.println("Peterson Number");
	}
	else {
		System.out.println("Not petersons Number");
	}
  }
  
	public static int fact(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
}

