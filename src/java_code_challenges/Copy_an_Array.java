package java_code_challenges;

import java.util.Arrays;

public class Copy_an_Array {

	public static void main(String[] args) {

		// Write a Java program to copy an array by iterating the array.

		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] new_array = new int[my_array.length];     

		for(int i=0; i < my_array.length; i++) {
			new_array[i] = my_array[i];
		}
		System.out.println("new array : "+ Arrays.toString(new_array));
	}
}
