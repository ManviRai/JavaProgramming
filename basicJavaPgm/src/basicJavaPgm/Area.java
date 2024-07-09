package basicJavaPgm;

import java.util.Scanner;

public class Area {
   public static void main(String[] args) {
	Area ra=new Area();
	System.out.println("Area of a circle is :"+ra.area());
	
}

   public double area() {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=sc.nextInt();
	   double pi=3.14;
	   return pi*r*r;
   }
}
