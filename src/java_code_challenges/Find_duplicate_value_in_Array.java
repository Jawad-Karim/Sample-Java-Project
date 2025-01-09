package java_code_challenges;
import java.util.HashSet;
public class Find_duplicate_value_in_Array {
	public static void main(String[] args) {

// ***** find duplicate values in an array of integer values. ****************
		int[] my_array2 = {1, 5, 2, 5, 6, 6, 6, 7, 5, 2};
		for (int i = 0; i < my_array2.length-1; i++){
			for (int j = i+1; j < my_array2.length; j++){
				if ((my_array2[i] == my_array2[j])){
					System.out.println("Duplicate Element : "+my_array2[j]);
				}
			}
		}
//******** remove duplicate character from a Strings **********************************
		
		//approach 1
		//indexOf() method returns the first occurrence of character/subString in a String.
		//if the character/subString not found in the String returns -1.
		String s1 = "aabbcc";
		String[] ar = s1.split("");  		//or char[] ar = sr.toCharArray();
		String s2 = "";
		for(String value: ar) {
			if (s2.indexOf(value) == -1) { //returns -1 if value is not in the s2 yet.
				s2 += value;				//value is added to the s2 now.
			}
		}
		System.out.println(s2);

		//approach 2
		String st1 = "xxxyyyzzz";
		HashSet<String> set = new HashSet<>();
		String[] arr = st1.split("");
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}
