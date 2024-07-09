package impConcepts;

public class SwapWoTemp {
   public static void main(String[] args) {
	   int a=40;
		int b=20;
		System.out.println("Original: a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Reversed Value:a="+a+" b="+b);
}
}
