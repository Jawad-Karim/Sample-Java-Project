package java_code_challenges;

import java.util.HashMap;
import java.util.Map;

public class Count_Each_Character_Of_a_String {

	public static void main(String[] args) {

		String s = "JavaProgramming";

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println("total count of each character in String: ");
		System.out.println(charMap.entrySet());

		for (char car : charMap.keySet()) {
			System.out.println(car + " = " + charMap.get(car));
		}
	}

}
