package java_code_challenges;

import java.util.ArrayList;

public class Find_common_elements_in_3_sorted_Array {

	public static void main(String[] args) {

		// Write a Java program to find common elements in three sorted arrays.

		ArrayList<Integer> common = new ArrayList<Integer>();

		int arr1[] = {2, 4, 8};
		int arr2[] = {2, 3, 4, 8, 10, 16};
		int arr3[] = {4, 8, 14, 40};
		int x = 0, y = 0, z = 0;

		while (x < arr1.length && y < arr2.length && z < arr3.length){
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]){
				
				common.add(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if (arr1[x] < arr2[y])
				x++;
			else if (arr2[y] < arr3[z])
				y++;
			else
				z++;
		}
		System.out.println("Common elements from three sorted  arrays : " + common);
	}
}
