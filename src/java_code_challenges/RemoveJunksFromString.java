package java_code_challenges;

public class RemoveJunksFromString {

	public static void main(String[] args) {
		
		// ^ is char operator
		String s = "&*%$#$%*@##$ Hello World 1234";
		s = s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("after removing junks s is : "+ s);
	}
}
