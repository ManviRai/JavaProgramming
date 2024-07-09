package impConcepts;

import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
	System.out.println("Area of circle:"+circle());
	System.out.println("Area of square:"+square());
	System.out.println("Area of recatangle"+rectangle());
	System.out.println("Area of triangle"+triangle());
}
  public static double circle() {
	  System.out.println("Enter the radius for circle");
	  Scanner sc=new Scanner(System.in);
	  int r=sc.nextInt();
	  double pi=3.14;
	  return pi*r*r;
  }
  public static double square() {
	  System.out.println("Enter the size for square");
	  Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	  return size*size;
  }
  public static int rectangle() {
	  System.out.println("Enter length and breadth for rectangle ");
	  Scanner sc=new Scanner(System.in);
	 int len=sc.nextInt();
	 int bre=sc.nextInt();
	  return len*bre;
  }
  public static double triangle() {
	  System.out.println("Enter breadth and height for triangle ");
	  Scanner sc=new Scanner(System.in);
	 int breadth=sc.nextInt();
	 int height=sc.nextInt(); 
	  return 0.5*breadth*height;
  }
}
