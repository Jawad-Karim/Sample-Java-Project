package java_code_challenges;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandonNumber_Stings {

	public static void main(String[] args) {		
//approach 1
		Random rand = new Random();
		int n = rand.nextInt(10); 	// 0-9
		double d = rand.nextDouble();	// 0.0 - less than 1.0
		System.out.println(n+"\n"+d);
		
//approach 2
	    System.out.println(Math.random());  // generates a random number between 0 to 1
	    

// approach 3: download apache commons-lang API - jar and add to project buildpath.
//  https://commons.apache.org/proper/commons-lang/download_lang.cgi
	    String randNum = RandomStringUtils.randomNumeric(5);
	    System.out.println(randNum);
	    
	    String randAlpha = RandomStringUtils.randomAlphabetic(5);
	    System.out.println(randAlpha);
	}
}
