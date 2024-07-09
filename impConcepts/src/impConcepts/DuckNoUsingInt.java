package impConcepts;

import java.util.Scanner;

//Incorrect

public class DuckNoUsingInt {
  public static void main(String[] args) {
	  int flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int num=sc.nextInt();
       while(num>0) {
		if(num%10==0) {
			num=num/10;
			flag=1;
			break;
		}
		else {
			flag=0;
			break;
		}
	}
       if(flag==1) {
    	   System.out.println("Duck no");
       }
       else {
    	   System.out.println("Not duck");
       }
}
}
