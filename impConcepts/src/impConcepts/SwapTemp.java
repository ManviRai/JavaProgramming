package impConcepts;

public class SwapTemp {
   public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("Original: a="+a+" b="+b);
	int temp;
	
	temp=a;
	a=b;
	b=temp;
	System.out.println("Reversed Value:a="+a+" b="+b);
	
}
}
