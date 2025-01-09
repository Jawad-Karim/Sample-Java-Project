package java_code_challenges;

public class Count_upper_and_lower_case_letter {

	public static void main(String[] args) {

//approach 1
		String s1 =  "HellO WorLD";
		String upper = "";
		String lower = "";

		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c>=65 && c<=90) {
				upper = upper+c;
			}
			else {
				lower += c;
			}
		}
		System.out.println(upper);
		System.out.println(lower);

//approach 2
		String s2 = "WelCome To AutoMatioN";
		String cap = "";
		String sml = "";

		for(int i=0; i<s2.length(); i++) {
			char c = s2.charAt(i);
			if(c>='A' && c<='Z') {
				cap += c;
			}
			else if(c>='a' && c<='z'){
				sml += c;
			}
		}
		System.out.println(cap);
		System.out.println(sml);
	}
}
