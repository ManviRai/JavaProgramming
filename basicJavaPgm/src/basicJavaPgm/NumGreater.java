package basicJavaPgm;

import java.util.Scanner;

public class NumGreater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n>=10) {
			System.out.println("The number is greater than or equal to 10");
		}
		else {
			System.out.println("Number is smaller than 10");
		}

	}
}
