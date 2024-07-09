package impConcepts;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("factorial is "+fact(n));
	}
   public static int fact(int n) {
	   if(n==1) {
		   return 1;
	   }
	   else {
		   return n*fact(n-1);
	   }
   }
}
