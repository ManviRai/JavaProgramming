package impConcepts;

import java.util.Scanner;

public class DuckNoThroughString {
	public static void main(String[] args) {
		int flag=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String num=sc.next();
		for(int i=0;i<num.length();i++) {
			if(num.charAt(i)=='0') {
				count++;
			}
		}
		char start=num.charAt(0);
		if(start!='0' && count>0) {
			flag=1;
		}
		else {
			flag=0;
		}
		
		if(flag==1) {
			System.out.println("Duck no");
		}
		else {
			System.out.println("Not duck no");
		}
	}
}
		
