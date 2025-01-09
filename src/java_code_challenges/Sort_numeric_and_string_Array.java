package java_code_challenges;

import java.util.Arrays;
import java.util.Collections;

public class Sort_numeric_and_string_Array {

	public static void main(String[] args) {

		// Write a Java program to sort a numeric array and a string array.		
		Integer[] numericArray = {40, 30, 20, 70, 90, 60, 10, 50, 100};
		Arrays.sort(numericArray);
		System.out.println("sorted numeric array : "+ Arrays.toString(numericArray));

		String[] stringArray = {"kally", "ronnie", "jonny", "ben"};
		Arrays.sort(stringArray);
		System.out.println("sorted string array : "+ Arrays.toString(stringArray));

		Arrays.sort(numericArray, Collections.reverseOrder());
		System.out.println("sorted reverse order : "+Arrays.toString(numericArray));		
	}
}
