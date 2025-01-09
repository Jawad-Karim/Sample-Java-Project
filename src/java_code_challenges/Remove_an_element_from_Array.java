package java_code_challenges;

import java.util.Arrays;

public class Remove_an_element_from_Array {

	public static void main(String[] args) {

		// Write a Java program to remove a specific element from an array.

		int[] myNum1 = {40, 30, 20, 70, 90, 60, 10, 50, 100};
		System.out.println("array before removing item : "+ Arrays.toString(myNum1));

		int removeItem = 60;
		for(int i=0; i<myNum1.length; i++) {
			if(myNum1[i] == removeItem) {
				for(int j=i; j<myNum1.length-1; j++) {
					myNum1[j] = myNum1[j+1];
				}
				break;
			}
		}
		// last item will be twice because array is fixed length;
		System.out.println("array after removing item : "+ Arrays.toString(myNum1));
	}
}
