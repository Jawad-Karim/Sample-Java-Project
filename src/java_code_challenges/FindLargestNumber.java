package java_code_challenges;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int a=10;
		int b=20; 
		int c=30;	
		
//approach 1
		if(a>b && a>c) {
			System.out.println("a: "+a+" is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println("b: "+b+" is the largest number");
		}
		else if(c>a && c>b) {
			System.out.println("c: "+c+" is the largest number");
		}
//approach 2
		int largestNumber = (a>b ? a:b) > c ? (a>b ? a:b) : c;
		System.out.println(largestNumber);
		
	}

}
