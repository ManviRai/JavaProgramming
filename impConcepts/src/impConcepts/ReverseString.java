package impConcepts;

public class ReverseString {
	//quite complex
	
	public static String reverse(String str)
	{
		   char[] ch=str.toCharArray();
		   int left=0;
		   int right=ch.length-1;
		   char temp;
		   
		  while(left<right) 
		  {
			  temp=ch[left];
			  ch[left]=ch[right];
			  ch[right]=temp;
			  left++;
			  right--;
			  
			 
		  }
		  return new String(ch);
	}
   public static void main(String[] args) {
	String str="Hello World!";
	String reverse=reverse(str);
	
	System.out.println(reverse);
	
	
	
}
   
}
