package java_code_challenges;

public class PalindromeOrNot {
	//palindrome number is a number that remains same after reverse.

	public static void main(String[] args) {
	
//palindrome Integer
		int original_num = 12321;
		int n = original_num;
		int rev = 0;
		
		while(n!=0) {
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println("original number: "+ original_num);
		System.out.println("reverse number: "+ rev);
		
		if(original_num==rev) {
			System.out.println("palindrome");
		}
		else {
			System.err.println("not palindrome");
		}
//palindrome String
		String s = "loyol";
		String rvrs = "";
		for(int i=s.length()-1; i>=0; i--) {
			rvrs += s.charAt(i);
		}
		System.out.println(rvrs.equals(s)?"s is palindrome" : "s is not palindrome"); //outcome: emocleW

// count number of digits
		int num1 = 165375;
		int count = 0;
		while(num1>0) {
			count++;
			num1 = num1/10;
		}
		System.out.println(count);
		
// sum of digits
		int num2 = 165375;
		int sum = 0;
		while(num2>0) {
			sum = sum+num2%10;
			num2 = num2/10;
		}
		System.out.println(sum);
	}
}
