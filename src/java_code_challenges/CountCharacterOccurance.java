package java_code_challenges;

public class CountCharacterOccurance {

	public static void main(String[] args) {

		//count character occurrence or 'o'
		String s1 = "Java object oops concepts";
		String s2 = s1.replace("o", "");

		int l1 = s1.length();
		int l2 = s2.length();
		System.out.println("totoal occurance of o is: "+ (l1 - l2));
		
		//count words
		String s = "Java object oops concepts";
		String[] arr = s.split(" ");		
		System.out.println(arr.length);
	}
}
