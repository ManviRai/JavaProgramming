package impConcepts;

public class Fibonacci {
    public static void main(String[] args) {
		int t1=0,t2=1,t3=0;
		System.out.println(t1+"\n"+t2);
		for(int i=0;i<=10;i++) {
			t3=t2+t1;
			t1=t2;
			t2=t3;
			System.out.println(t3);
		}
		
}
}