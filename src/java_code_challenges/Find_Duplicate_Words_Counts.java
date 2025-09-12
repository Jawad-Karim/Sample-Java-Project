package java_code_challenges;

import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate_Words_Counts {

	public static void main(String[] args) {
		
		String text = "Java is Java and Java is a world of fun";
		String [] wordArr = text.split(" ");
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		for(String word : wordArr) {
			if(wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word)+1);
			}
			else {
				wordMap.put(word, 1);
			}			
		}
		System.out.println("Total words: \n" + wordMap.entrySet());
	}

}
