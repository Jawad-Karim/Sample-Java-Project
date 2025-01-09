package java_code_challenges;

import java.util.Arrays;

public class Reverse_an_Array {

	public static void main(String[] args) {

		// Write a Java program to reverse an array of integer values..
		int[] my_array1 = {10, 20, 30, 40, 50, 60};

		for(int i = 0; i < my_array1.length / 2; i++){
			
			int temp = my_array1[i];
			my_array1[i] = my_array1[my_array1.length -1 -i];
			my_array1[my_array1.length -1 -i] = temp;
		}
		System.out.println("Reversed array : "+Arrays.toString(my_array1));
	}
}
