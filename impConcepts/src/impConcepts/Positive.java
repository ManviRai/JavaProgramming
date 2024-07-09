package impConcepts;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if (num<0){
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is 0");
		}
	}
}
