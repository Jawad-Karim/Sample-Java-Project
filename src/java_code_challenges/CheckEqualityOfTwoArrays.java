package java_code_challenges;
import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		//Approach 1
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,4,4,5};		
		boolean status1 = Arrays.equals(a, b);
		if(status1 == true) {
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}
		
		//Approach2
		String status2 = "Arrays are equal";
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]!=b[i]) {
					status2 = "Arrays are not equal in value";
					break;
				}				
			}
		}		
		else {
			System.out.println("arrays are not equal in length");
		}
		System.out.println(status2);
	}
}
