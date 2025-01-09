package java_code_challenges;

import java.util.Arrays;

public class Insert_an_element_to_Array {

	public static void main(String[] args) {

		// Write a Java program to insert an element (specific position) into an array.

		int[] array1 = {40, 30, 50, 70, 90, 60, 10, 20, 100};
		int index_position = 2;
		int insertItem = 120;

		for(int i=array1.length-1; i>index_position; i--) {
			array1[i] = array1[i-1];	
		}
		array1[index_position] = insertItem;
		// last element will be removed from array.
		System.out.println("array after insertion : "+ Arrays.toString(array1));
	}
}
