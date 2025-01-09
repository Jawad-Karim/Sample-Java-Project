package java_code_challenges;

public class Count_the_vowels_of_Strings {

	public static void main(String[] args) {
		
		String s = "Welcome to Automation";	
		String s1 = s.toLowerCase();
		int vowels = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels ++;
			}
		}
		System.out.println(vowels);
	}

}
