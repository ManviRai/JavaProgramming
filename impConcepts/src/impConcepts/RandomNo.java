package impConcepts;

import java.util.Random;
//Using Random Class
public class RandomNo {
 public static void main(String[] args) {
	 Random rand=new Random();
	 int random=rand.nextInt(100);
	System.out.println("Random number "+random);
	System.out.println("-----------------");
	//Using math.random()
	System.out.println("Random number "+Math.random());
}
}
